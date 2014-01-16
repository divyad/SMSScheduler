package com.message.smsscheduler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText toRecipient;
	EditText ccRecipient;
	EditText subject;
	EditText message;
	private Button sendbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sendbtn = (Button) findViewById(R.id.send);
		toRecipient = (EditText) findViewById(R.id.toRecipient);
		ccRecipient = (EditText) findViewById(R.id.ccRecipient);
		subject = (EditText) findViewById(R.id.subject);
		message = (EditText) findViewById(R.id.body);
		
		System.out.println("toRecipient:-"+toRecipient);
		System.out.println("ccRecipient:-"+ccRecipient);
		System.out.println("subject:-"+subject);
		System.out.println("message:-"+message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
