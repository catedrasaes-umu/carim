package org.pedromateo.umulandertest;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.carim.instantiation.CarimInstantiationFramework;
import org.carim.model.UserAttitude;
import org.carim.model.UserRatings;
import org.json.JSONException;
import org.json.JSONObject;
import org.mmi.android.genericquest.QuestManager;
import org.mmi.android.instrumentation.ContextDescription;
import org.mmi.android.instrumentation.InstrumentationContext;
import org.mmi.android.instrumentation.ContextDescription.Device.DeviceType;
import org.mmi.android.instrumentation.ContextDescription.LocationTime.MobilityLevel;
import org.mmi.android.instrumentation.ContextDescription.PhysicalEnvironment.Weather;
import org.mmi.android.instrumentation.ContextDescription.SocialContext.SocialArena;
import org.mmi.android.instrumentation.ContextDescription.SocialContext.SocialCompany;
import org.mmi.android.instrumentation.ContextDescription.User.EducationLevel;
import org.mmi.android.instrumentation.ContextDescription.User.Gender;
import org.mmi.android.instrumentation.ContextDescription.User.PreviousExperience;
import org.mmi.android.instrumentation.config.InstrumentationConfig;
import org.mmi.android.instrumentation.config.JSONConfiguration;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.pool.EventPool;

import org.pedromateo.umulandertest.R;

import android.os.Bundle;
import android.os.StrictMode;
import android.provider.Settings.Secure;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends Activity {

	private static final String TAG = "SettingsActivity";

	private String _arraySpinner[];

	/// ///////////////////////////////////////////////////////////////
	/// process variables
	/// ///////////////////////////////////////////////////////////////
	///

	/// enable test steps and services
	private boolean _do_quest = true;
	private boolean _send_final_results = true;

	/// context questionnaire variables
	private boolean _is_context_quest_launched = false;
	private boolean _is_context_quest_done = false;
	private ArrayList<String> _context_quest_results;
	private final int CONTEXT_Q_ID = 111; 

	/// instrumentation process variables
	private boolean _is_instrumentation_initialized = false;
	CarimInstantiationFramework cinstFramework = null;
	AHE16Facade facade = null;
	private boolean _is_interaction_started = false;
	private boolean _is_interaction_done = false;

	///QoE questionnaire variables
	private boolean _is_qoe_quest_launched = false;
	private boolean _is_qoe_quest_done = false;
	private ArrayList<String> _qoe_quest_results;
	private final int QOE_Q_ID = 222;

	/// 
	/// ///////////////////////////////////////////////////////////////


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		///
		/// configure spinner
		///

		//
		_arraySpinner = new String[3];
		_arraySpinner[0] = "easy / fácil";
		_arraySpinner[1] = "medium / medio";
		_arraySpinner[2] = "hard / difícil";

		Spinner s = (Spinner) findViewById(R.id.sLevel);
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_item, _arraySpinner);
		s.setAdapter(adapter);

		// set size of items text
		//TextView tv = (TextView)s.getChildAt(0);
		//if (tv != null) tv.setTextSize(20);
		//tv = (TextView)s.getChildAt(1);
		//if (tv != null) tv.setTextSize(20);
		//tv = (TextView)s.getChildAt(2);
		//if (tv != null) tv.setTextSize(20);

		///
		///
		/// go to game button listener
		findViewById(R.id.bGoGame).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_startGameActivity();
			}
		});

		///
		///
		/// finish button listener
		findViewById(R.id.bExit).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_finishTest();
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();

		///
		/// step 1: do context quest
		if (_do_quest && !_is_context_quest_launched){
			_launchContextQuestionnaire();
		}

		///
		/// step 2: instrumentation starts and game is played
		else if (!_is_interaction_started){
			// we wait for the user to click the button
		}

		///
		/// step 3: a dialog ends (maybe the last or not, we do not know it)
		else{
			/// ///////////////////////////////////////////////////////////////
			/// instrumentation - dialogue end
			/// ///////////////////////////////////////////////////////////////
			///
			// end dialogue
			cinstFramework.pool.postEvent(
					cinstFramework.factory.createEndDialogueEvent(), -1);

			_is_interaction_done = true;
			/// 
			/// ///////////////////////////////////////////////////////////////
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		/// ///////////////////////////////////////////////////////////////
		/// 1st result - context questionnaire
		/// ///////////////////////////////////////////////////////////////
		///

		if (requestCode == CONTEXT_Q_ID) {
			// Make sure the request was successful
			if (resultCode == RESULT_OK) {

				_context_quest_results = new ArrayList<String>();

				// get the number of questions
				int nquest = data.getIntExtra(QuestManager.Q_NUMBER_QUESTIONS,0);
				Log.i(TAG,"CONTEXT QUESTIONNAIRE RESULT. nquestions = " + nquest);

				// get the results
				for (int i = 0; i < nquest; i++){
					_context_quest_results.add(data.getStringExtra(Integer.toString(i)));
					Log.i(TAG,"  - " + _context_quest_results.get(i));
				}
				// set the quest as done
				_is_context_quest_done = true;

				// do nothing, we are now in the main activity
			}
		}

		/// 
		/// ///////////////////////////////////////////////////////////////

		/// ///////////////////////////////////////////////////////////////
		/// QoE questionnaire - results
		/// ///////////////////////////////////////////////////////////////
		///

		if (requestCode == QOE_Q_ID) {
			// Make sure the request was successful
			if (resultCode == RESULT_OK) {

				_qoe_quest_results = new ArrayList<String>();

				// get the number of questions
				int nquest = data.getIntExtra(QuestManager.Q_NUMBER_QUESTIONS,0);
				Log.e(TAG,"QoE QUESTIONNAIRE RESULT. nquestions = " + nquest);

				// get the results
				for (int i = 0; i < nquest; i++){
					_qoe_quest_results.add(data.getStringExtra(Integer.toString(i)));
					Log.e(TAG,"  - " + _qoe_quest_results.get(i));
				}

				// add results to current Trial
				if (_qoe_quest_results != null && _qoe_quest_results.size() > 0){
					for (int i = 0; i < _qoe_quest_results.size(); i++){
						if (!_parseQoeJSONValue(_qoe_quest_results.get(i),
								QuestManager.Q_VALUE, QuestManager.Q_RESULT))
							Log.e(TAG,"ERROR: while parsing string: " + _qoe_quest_results.get(i));
					}
				}

				// set the quest as done
				_is_qoe_quest_done = true;

				/// send results and finish the application
				_sendResultsAndFinish();
			}
		}

		/// 
		/// ///////////////////////////////////////////////////////////////
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();


	}


	private void _startGameActivity(){
		Spinner s = (Spinner)findViewById(R.id.sLevel);

		// start instrumentation if not started before
		if (!_is_instrumentation_initialized){

			_initializeInstrumentation();
		}

		// start activity 
		Intent intent = new Intent(this,LunarLander.class);
		Bundle data = new Bundle();
		data.putString("level",((Integer)s.getSelectedItemPosition()).toString());
		intent.putExtras(data);

		/// ///////////////////////////////////////////////////////////////
		/// instrumentation - dialogue start
		/// ///////////////////////////////////////////////////////////////
		///
		// reset event times
		cinstFramework.factory.resetTimestamp();
		// start dialogue
		cinstFramework.pool.postEvent(
				cinstFramework.factory.createStartDialogueEvent(), -1);
		/// 
		/// ///////////////////////////////////////////////////////////////

		// mark interaction as started
		_is_interaction_started = true;

		// launch the game
		startActivity(intent);
	}


	private void _finishTest(){

		///
		/// if interaction done...
		if (_is_interaction_done){

			/// ///////////////////////////////////////////////////////////////
			/// end instrumentation
			/// ///////////////////////////////////////////////////////////////
			///
			try {
				// 1. end interaction tracking
				InstrumentationContext.get().endInteraction(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
			/// 
			/// ///////////////////////////////////////////////////////////////

			///
			/// launch the QoE questionnaire
			if (_do_quest && !_is_qoe_quest_launched){
				_launchQoEQuestionnaire();
			}
			///
			else{
				// send results
				_sendResultsAndFinish();
			}	
		}

		///
		/// if interaction is not done yet...
		else{
			Context context = getApplicationContext();
			CharSequence text = "Please, at least one interaction has to be performed before finishing the test!";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}
	}

	private void _sendResultsAndFinish(){
		// send results
		if (_send_final_results)
			_sendInstrumentationResults();
		// finish the test
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_settings, menu);
		return true;
	}

	///
	/// ///////////////////////////////////////////////////////////////////
	///

	///
	/// supporting methods
	///

	private void _launchContextQuestionnaire(){

		_is_context_quest_launched = true;

		/// ///////////////////////////////////////////////////////////////
		/// context questionnaire - launch
		/// ///////////////////////////////////////////////////////////////
		///
		/// launch questionnaire
		Intent intent = new Intent(this,QuestManager.class); 

		Bundle data = new Bundle();
		data.putString(QuestManager.Q_FILE,"context_quest_config.json");
		intent.putExtras(data);

		startActivityForResult(intent,CONTEXT_Q_ID);
		/// 
		/// ///////////////////////////////////////////////////////////////
	}

	private void _launchQoEQuestionnaire(){

		_is_qoe_quest_launched = true;

		/// ///////////////////////////////////////////////////////////////
		/// ratings questionnaire - launch
		/// ///////////////////////////////////////////////////////////////
		///
		/// launch questionnaire
		Intent intent = new Intent(this,QuestManager.class); 

		Bundle data = new Bundle();
		data.putString(QuestManager.Q_FILE,"qoe_quest_config.json");
		intent.putExtras(data);

		startActivityForResult(intent,QOE_Q_ID);
		/// 
		/// ///////////////////////////////////////////////////////////////
	}

	private void _initializeInstrumentation(){
		/// ///////////////////////////////////////////////////////////////
		/// instrumentation - initialization
		/// ///////////////////////////////////////////////////////////////
		///
		try {
			// 1. create a configuration object from config file
			String configPath = "instrumentation_config.json";
			InputStream configFile = null;
			try{
				configFile = getAssets().open(configPath); 
			}
			catch (Exception e) {
				e.printStackTrace();
				finish();
			}
			InstrumentationConfig config = 
					new InstrumentationConfig(configFile);
			Log.i(TAG,"InstrumentationConfig loaded.");

			// 2. (optional) create an initial context with values obtained
			//    from a previous questionnaire 
			ContextDescription context = null;
			if (_context_quest_results != null && _context_quest_results.size() > 0){
				context = new ContextDescription();
				for (int i = 0; i < _context_quest_results.size(); i++){ 
					if (!context.parseContextJSONValue(_context_quest_results.get(i),
							QuestManager.Q_VALUE, QuestManager.Q_RESULT))
						Log.e(TAG,"ERROR: while parsing string: " + _context_quest_results.get(i));
				}
				Log.i(TAG,"ContextDescription ready. Values: " + _context_quest_results.size());
			}

			// 3. create the facade and the instantiator
			cinstFramework = new CarimInstantiationFramework();
			facade = new AHE16Facade(cinstFramework); 
			Log.i(TAG,"Framework created.");

			// 4. initialize instrumentation process
			if (!InstrumentationContext.initializeInstrumentation(facade,config,context)){
				Log.e(TAG, "ERROR when initializing InstrumentationContext");
				finish();
			}
			Log.i(TAG,"InstrumentationContext initialized.");

			// 5. register this activity as the main activity
			//InstrumentationContext.get().registerMainActivity(this);

			// 6. start interaction tracking
			//InstrumentationContext.get().startInteraction(); 

			// we will only track LunarLander activity in our experiment

			// do instrumentation only once
			_is_instrumentation_initialized = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		/// 
		/// ///////////////////////////////////////////////////////////////
	}

	private void _sendInstrumentationResults(){
		/// ///////////////////////////////////////////////////////////////
		/// send results 
		/// ///////////////////////////////////////////////////////////////
		///
		try{
			///
			/// save the file

			String filename = "";
			String filepath = "";
			final String extension = ".crf";

			// generate unique name
			String android_id = Secure.getString(getBaseContext().getContentResolver(),
					Secure.ANDROID_ID); 

			SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd_hhmmss");
			String timestamp = s.format(new Date());

			filename = android_id + "__" + timestamp + extension;

			// generate a temporal path
			String temPath = null;
			File outFile = File.createTempFile("carim_", ".crf", getDir(temPath, MODE_PRIVATE));
			filepath = outFile.getAbsolutePath().substring(0,outFile.getAbsolutePath().lastIndexOf('/'))
					+ filename;

			Log.e(TAG,"Saving temporary CARIM file at: " + filepath);
			cinstFramework.saveTrial(filepath);

			///
			/// upload the file

			//String filename = "sample_trial.crf";
			//InputStream filestream = getAssets().open(filename);
			FileInputStream fis = new FileInputStream(filepath);
			UploadUtils.uploadFilePOST(filename,fis,"http://yayu.inf.um.es/carim_results/upload.php");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		/// 
		/// ///////////////////////////////////////////////////////////////
	}

	private boolean _parseQoeJSONValue(String jsonString, String keyString , String valueString){
		// get the JSON object from the string
		JSONObject o = JSONConfiguration.parseJSONString(jsonString);
		if (o == null)
			Log.e(TAG,"(_parseQoeJSONValue) ERROR: result JSON object is null.");

		// get values from object

		String key = "";
		try {
			key = o.getString(keyString);
		} catch (JSONException e) {
			e.printStackTrace();
			return false;
		}
		String value = "";
		try {
			value = o.getString(valueString);
		} catch (JSONException e) {
			e.printStackTrace();
			return false;
		}

		if (key.equals("") || value.equals("")){
			Log.e(TAG,"(_parseQoeJSONValue) ERROR: key or value are empty. key = " + key + "; value = " + value);
			return false;
		}

		///
		/// set value

		try {

			/// /////////////////////////////////////////////////////////////////
			/// QoE VALUES
			/// /////////////////////////////////////////////////////////////////

			///
			/// mood (always create new)
			///

			if (key.equals("mood")){

				String mood_value = o.getString(valueString);

				float f = 0;
				if (mood_value.equals("very sad")){
					f = 1;
				}
				else if (mood_value.equals("sad")){
					f = 2;
				}
				else if (mood_value.equals("normal")){
					f = 3;
				}
				else if (mood_value.equals("happy")){
					f = 4;
				}
				else if (mood_value.equals("very happy")){
					f = 5;
				}
				else 
					throw new IllegalArgumentException();

				cinstFramework.getCurrentTrial().getUserData().getUserMood().add(f);
			}

			///
			/// attitude (set into current)
			///
			else if (key.startsWith("att")){

				if (cinstFramework.getCurrentTrial().getUserData().getUserAttitude() == null)
					cinstFramework.getCurrentTrial().getUserData().setUserAttitude(cinstFramework.instantiator.icontext_.mfact.createUserAttitude());
				UserAttitude ua = cinstFramework.getCurrentTrial().getUserData().getUserAttitude();

				//parse value - setUsefulness
				if (key.equals("att1")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ua.setUsefulness(f);
				}
				//parse value - setPleasantness
				else if (key.equals("att2")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ua.setPleasantness(f);
				}
				//parse value - setIntegration
				else if (key.equals("att3")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ua.setIntegration(f);
				}
				//parse value - setSelfEfficacy
				else if (key.equals("att4")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ua.setSelfEfficacy(f);
				}
				//parse value - setComfort
				else if (key.equals("att5")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ua.setComfort(f);
				}
			}

			///
			/// ratings (only create new if null)
			///
			else if (key.startsWith("qoe")){

				// create new UserRatings if current == null
				int size = cinstFramework.getCurrentTrial().getUserData().getUserRatings().size();
				if (size == 0){
					cinstFramework.getCurrentTrial().getUserData().getUserRatings().add(
							cinstFramework.instantiator.icontext_.mfact.createUserRatings());
					size++;
				}

				UserRatings ur = cinstFramework.getCurrentTrial().getUserData().getUserRatings().get(size - 1);
				if (ur == null)
					throw new NullPointerException();

				//parse value - practical
				if (key.equals("qoe1")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setPractical(f);
				}
				//parse value - setPredictable
				else if (key.equals("qoe2")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setPredictable(f);
				}
				//parse value - setClearlyStructured
				else if (key.equals("qoe3")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setClearlyStructured(f);
				}
				//parse value - setSimple
				else if (key.equals("qoe4")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setSimple(f);
				}
				//parse value - setStylish
				else if (key.equals("qoe5")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setStylish(f);
				}
				//parse value - setPremium
				else if (key.equals("qoe6")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setPremium(f);
				}
				//parse value - setCreative
				else if (key.equals("qoe7")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setCreative(f);
				}
				//parse value - setCaptivating
				else if (key.equals("qoe8")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setCaptivating(f);
				}
				//parse value - setBeautiful
				else if (key.equals("qoe9")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setBeautiful(f);
				}
				//parse value - setGood
				else if (key.equals("qoe10")){
					float f = Float.valueOf(o.getString(valueString)).floatValue();
					ur.setGood(f);
				}
			}
			return true;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/// disble back button
	@Override
	public void onBackPressed() {
	}

}
