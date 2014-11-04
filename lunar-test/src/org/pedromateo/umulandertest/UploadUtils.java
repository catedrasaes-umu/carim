package org.pedromateo.umulandertest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class UploadUtils {

	private static final String TAG = "UploadUtils";

	public static boolean uploadFilePOST(String filename, InputStream inputstream, String urlstring){

		final String URL = urlstring;
		final String FILENAME = filename;
		final InputStream INPUT_STREAM = inputstream;

		// do the process in a new thread

		try {
			Thread t = new Thread(){
				//
				HttpURLConnection conn;
				//
				public void run(){
					try{
						String lineEnd = "\r\n";
						String twoHyphens = "--";
						String boundary = "*****";
						try {
							URL url = new URL(URL);
							// Open a HTTP connection to the URL
							conn = (HttpURLConnection) url.openConnection();
							conn.setDoInput(true);// Allow Inputs
							conn.setDoOutput(true);// Allow Outputs
							conn.setUseCaches(false);// Don't use a cached copy.
							conn.setRequestMethod("POST");// Use a post method.
							conn.setRequestProperty("Connection", "Keep-Alive");
							conn.setRequestProperty("Content-Type",
									"multipart/form-data;boundary=" + boundary);

							DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
							dos.writeBytes(twoHyphens + boundary + lineEnd);
							dos.writeBytes("Content-Disposition: post-data; name=file;filename="
									+ FILENAME + "; type=carim/crf " + lineEnd); 
							dos.writeBytes(lineEnd);

							// create a buffer of maximum size
							int bytesAvailable = INPUT_STREAM.available();
							int maxBufferSize = 1000;
							// int bufferSize = Math.min(bytesAvailable, maxBufferSize);
							byte[] buffer = new byte[bytesAvailable];

							// read file and write it into form...
							int bytesRead = INPUT_STREAM.read(buffer, 0, bytesAvailable);
							while (bytesRead > 0) {
								dos.write(buffer, 0, bytesAvailable);
								bytesAvailable = INPUT_STREAM.available();
								bytesAvailable = Math.min(bytesAvailable, maxBufferSize);
								bytesRead = INPUT_STREAM.read(buffer, 0, bytesAvailable);
							}

							// send multipart form data necesssary after file data...
							dos.writeBytes(lineEnd);
							dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

							// close streams
							INPUT_STREAM.close();
							dos.flush();
							dos.close();

						} 
						catch (Exception e) {
							e.printStackTrace();
						}

						
						// read answer
						try {
							BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
							String line;
							while ((line = rd.readLine()) != null) {
								Log.e(TAG, "Message: " + line);
							}
							rd.close();
						} 
						catch (IOException e) {
							e.printStackTrace();
						}
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};

			// do the work
			t.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
