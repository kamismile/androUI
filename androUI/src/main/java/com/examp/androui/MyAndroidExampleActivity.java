package com.examp.androui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.examp.androui.AlarmManager.AlarmTestActivity;
import com.examp.androui.GestureActivity.GestureTest;
import com.examp.androui.time.Timetest;

public class MyAndroidExampleActivity extends Activity implements
		View.OnClickListener {

	Button b1 = null;
	Button b2 = null;
	Button b3 = null;
	Intent intent = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        init();
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
    }

	public void init() {
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		intent = new Intent();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1:
			intent.setClass(this, AlarmTestActivity.class);
			startActivity(intent);
			break;
            case R.id.b2:
                intent.setClass(getApplicationContext(), GestureTest.class);
                startActivity(intent);

                break;
            case R.id.b3:
                intent.setClass(getApplicationContext(), Timetest.class);
                startActivity(intent);

                break;
		default:
			break;
		}

	}

}