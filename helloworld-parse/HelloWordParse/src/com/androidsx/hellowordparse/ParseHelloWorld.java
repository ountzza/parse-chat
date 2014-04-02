package com.androidsx.hellowordparse;

import android.app.Activity;
import android.net.ParseException;
import android.os.Bundle;
import android.view.Menu;

import com.parse.Parse;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class ParseHelloWorld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parse_hello_world);

		Parse.initialize(this, "ERvMl2l8nRqFp6wlaknjy5lFLhbjMYGks8ozs9HN",
				"RWLkkWO0jen3oVMjbVZfg0pYlEu54vZbxZcZ4J82");
		ParseUser();
	}

	public void ParseUser() {
		ParseUser user = new ParseUser();
		user.setUsername("Pocho");
		user.setPassword("1234");
		user.setEmail("alcoypocho@gmail.com");

		// other fields can be set just like with ParseObject
		user.put("phone", "650-253-0000");

		user.signUpInBackground(new SignUpCallback() {
			@SuppressWarnings("unused")
			public void done(ParseException e) {
				if (e == null) {
					// Hooray! Let them use the app now.
				} else {
					// Sign up didn't succeed. Look at the ParseException
					// to figure out what went wrong
				}
			}

			@Override
			public void done(com.parse.ParseException e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.parse_hello_world, menu);
		return true;
	}

}
