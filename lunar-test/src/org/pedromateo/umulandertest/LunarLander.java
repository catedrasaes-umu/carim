/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pedromateo.umulandertest;

import org.mmi.android.instrumentation.InstrumentationContext;
import org.pedromateo.umulandertest.LunarView.LunarThread;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem; 
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView; 

import org.pedromateo.umulandertest.R;

/**
 * This is a simple LunarLander activity that houses a single LunarView. It
 * demonstrates...
 * <ul>
 * <li>animating by calling invalidate() from draw()
 * <li>loading and drawing resources
 * <li>handling onPause() in an animation
 * </ul>
 */
public class LunarLander extends Activity {

	private static final String TAG = "LunarLander";

	/*
    private static final int MENU_EASY = 1;
    private static final int MENU_HARD = 2;
    private static final int MENU_MEDIUM = 3;
    private static final int MENU_PAUSE = 4;
    private static final int MENU_RESUME = 5;
    private static final int MENU_START = 6;
    private static final int MENU_STOP = 7;
	 */

	/** A handle to the thread that's actually running the animation. */
	private LunarThread mLunarThread;

	/** A handle to the View in which the game is running. */
	private LunarView mLunarView;

	/**
	 * Invoked when the Activity is created.
	 *
	 * @param savedInstanceState a Bundle containing state saved from a previous
	 *        execution, or null if this is a new execution
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// tell system to use the layout defined in our XML file
		setContentView(R.layout.lunar_layout);

		// get handles to the LunarView from XML, and its LunarThread
		mLunarView = (LunarView) findViewById(R.id.lunar);
		mLunarThread = mLunarView.getThread();

		// give the LunarView a handle to the TextView used for messages
		mLunarView.setTextView((TextView) findViewById(R.id.text));

		if (savedInstanceState == null) {
			// we were just launched: set up a new game
			mLunarThread.setState(LunarThread.STATE_READY);
			Log.w(this.getClass().getName(), "SIS is null");
		} else {
			// we are being restored: resume a previous game
			mLunarThread.restoreState(savedInstanceState);
			Log.w(this.getClass().getName(), "SIS is nonnull");
		}

		/// pedromateo's code start here

		// read the level from the parent activity
		String level = "";
		Bundle extras = getIntent().getExtras();
		if (extras == null){
			Log.e(TAG, "ERROR: No level to start the game.");
			finish();
		}
		else{
			level = extras.getString("level").trim();
			Log.e(TAG, "Level: " + level);

			// set level
			if (level.compareTo("0") == 0)
				mLunarThread.setDifficulty(LunarThread.DIFFICULTY_EASY);
			else if (level.compareTo("1") == 0)
				mLunarThread.setDifficulty(LunarThread.DIFFICULTY_MEDIUM);
			else if (level.compareTo("2") == 0)
				mLunarThread.setDifficulty(LunarThread.DIFFICULTY_HARD);
		}
		
		////
		//mLunarView.setOnTouchListener(new OnTouchListener() {
		//    @Override
		//    public boolean onTouch(View v, MotionEvent event) {
		//        Log.e(TAG,"@@@@@@@@@@@ INTERNAL LISTENER");
		//        return true;
		//    }
		//});
		////

		/// ///////////////////////////////////////////////////////////////
		/// instrumentation
		/// ///////////////////////////////////////////////////////////////
		///
		try {

			// 1. register this activity into the instrumentation process
			InstrumentationContext.get().registerMainActivity(this);
			
			// 2. start interaction tracking
			InstrumentationContext.get().startInteraction(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		/// 
		/// ///////////////////////////////////////////////////////////////
	}

	/**
	 * Invoked during init to give the Activity a chance to set up its Menu.
	 *
	 * @param menu the Menu to which entries may be added
	 * @return true
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);

		/*menu.add(0, MENU_START, 0, R.string.menu_start);
        menu.add(0, MENU_STOP, 0, R.string.menu_stop);
        menu.add(0, MENU_PAUSE, 0, R.string.menu_pause);
        menu.add(0, MENU_RESUME, 0, R.string.menu_resume);
        menu.add(0, MENU_EASY, 0, R.string.menu_easy);
        menu.add(0, MENU_MEDIUM, 0, R.string.menu_medium);
        menu.add(0, MENU_HARD, 0, R.string.menu_hard);
		 */
		return true;
	}
	

	/**
	 * Invoked when the user selects an item from the Menu.
	 *
	 * @param item the Menu entry which was selected
	 * @return true if the Menu item was legit (and we consumed it), false
	 *         otherwise
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/*switch (item.getItemId()) {
            case MENU_START:
                mLunarThread.doStart();
                return true;
            case MENU_STOP:
                mLunarThread.setState(LunarThread.STATE_LOSE,
                        getText(R.string.message_stopped));
                return true;
            case MENU_PAUSE:
                mLunarThread.pause();
                return true;
            case MENU_RESUME:
                mLunarThread.unpause();
                return true;
            case MENU_EASY:
                mLunarThread.setDifficulty(LunarThread.DIFFICULTY_EASY);
                return true;
            case MENU_MEDIUM:
                mLunarThread.setDifficulty(LunarThread.DIFFICULTY_MEDIUM);
                return true;
            case MENU_HARD:
                mLunarThread.setDifficulty(LunarThread.DIFFICULTY_HARD);
                return true;
        }
		 */

		return false;
	}

	/**
	 * Invoked when the Activity loses user focus.
	 */
	@Override
	protected void onPause() {
		super.onPause();
		//pause thread
		mLunarView.getThread().pause(); // pause game when Activity pauses
		///
		/// pedromateo
		
		// pause sensors
		mLunarView._stopSensorListener();
		
		///
		///
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		finish(); // finish activity
	}

	/**
	 * Notification that something is about to happen, to give the Activity a
	 * chance to save state.
	 *
	 * @param outState a Bundle into which this Activity should save its state
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// just have the View's thread save its state into our Bundle
		super.onSaveInstanceState(outState);
		mLunarThread.saveState(outState);
		Log.w(this.getClass().getName(), "SIS called");
	}
}
