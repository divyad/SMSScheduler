package com.message.smsscheduler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void sendMsg(View view)
	{
		System.out.println("toRecipient:-"+toRecipient.getText().toString());
		System.out.println("ccRecipient:-"+ccRecipient.getText().toString());
		System.out.println("subject:-"+subject.getText().toString());
		System.out.println("message:-"+message.getText().toString());
		
		if (toRecipient.getText().toString() == null || "".equals(toRecipient.getText().toString().trim())) {
			Toast.makeText(this, "Please select recipients", Toast.LENGTH_SHORT).show();
			return;
		}
		else if (subject.getText().toString() == null || "".equals(subject.getText().toString().trim())) {
			Toast.makeText(this, "Please enter a valid subject", Toast.LENGTH_SHORT).show();
			return;
		}
		
		Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show();
	
		resetComposeMsgView(view);
	}
	
	public void resetComposeMsgView(View view) {
		toRecipient.setText("");
		ccRecipient.setText("");
		subject.setText("");
		message.setText("");
	}
}
