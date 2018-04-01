package batter.skandalakshmi.com.receiversms;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SmsReceiver smsReceiver;
    final IntentFilter smsFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smsFilter.setPriority(1000);
        this.smsReceiver = new SmsReceiver();
        this.registerReceiver(this.smsReceiver, smsFilter);

    }
}
