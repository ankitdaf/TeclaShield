package ca.idi.tekla;

import ca.idi.tekla.sep.SEPService;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Demo extends Activity {

	private Button startBtn, stopBtn;	
	private EditText outEditText;
	private String logText = "";

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Views
        startBtn = (Button) findViewById(R.id.Button01);
        stopBtn = (Button) findViewById(R.id.Button02);
        outEditText = (EditText) findViewById(R.id.EditText01);
        
        //Intents & Intent Filters
        final Intent serviceIntent = new Intent();
        serviceIntent.setAction(SEPService.INTENT);
        IntentFilter fwdIntentFilter = new IntentFilter(SEPService.FWD_ACTION);
        IntentFilter backIntentFilter = new IntentFilter(SEPService.BACK_ACTION);
        IntentFilter rightIntentFilter = new IntentFilter(SEPService.RIGHT_ACTION);
        IntentFilter leftIntentFilter = new IntentFilter(SEPService.LEFT_ACTION);
        //IntentFilter noneIntentFilter = new IntentFilter(NONE_ACTION);

        outEditText.setText("");

        //Start service when Activity is run
        //startService(serviceIntent);

    	registerReceiver(intentReceiver, fwdIntentFilter);
    	registerReceiver(intentReceiver, backIntentFilter);
    	registerReceiver(intentReceiver, rightIntentFilter);
    	registerReceiver(intentReceiver, leftIntentFilter);
    	//registerReceiver(intentReceiver, noneIntentFilter);

    	startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(serviceIntent);
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	stopService(serviceIntent);
            }
        });

  }

	// Updates text in EditText view
	public void updateOutText(String s) {
    	logText += s;
		outEditText.setText(logText);
	}

	// Switch event provider events will be processed here
	private BroadcastReceiver intentReceiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			String action = intent.getAction();
			if (action.compareTo(SEPService.FWD_ACTION) == 0) {
				updateOutText("F");
			}
			if (action.compareTo(SEPService.BACK_ACTION) == 0) {
				updateOutText("B");
			}
			if (action.compareTo(SEPService.RIGHT_ACTION) == 0) {
				updateOutText("R");
			}
			if (action.compareTo(SEPService.LEFT_ACTION) == 0) {
				updateOutText("L");
			}
		}
	};

	@Override
	protected void onResume() {
		// Activity woke up
		super.onResume();
	}

	@Override
	protected void onPause() {
		// The activity went to sleep
		//unregisterReceiver(mIntentReceiver);
		super.onPause();
	}

	//private void updateRXbyte(String s) {
		//rxByteString = s;
		//logHandler.sendEmptyMessage(1);
	//}

	//private void updateTXbyte(String s) {
		//txByteString = s;
		//logHandler.sendEmptyMessage(2);
	//}

	//private Handler logHandler = new Handler() {
		//@Override
		//public void handleMessage(Message msg) {
			//switch (msg.what) {
			//case 0: logView.setText(logString);
			//case 1: rxByte.setText(rxByteString);
			//case 2: txByte.setText(txByteString);
			//}
		//}
	//};
    
}