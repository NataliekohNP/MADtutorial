package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        countDownTimer();
    }
    private int randomOTP(){
        Random ran = new Random();
        int value = ran.nextInt(100000);
        return value;
    }
    CountDownTimer mycountdown;
    private void countDownTimer(){
        TextView otpmsg = findViewById(R.id.otptext);

        otpmsg.setText(String.valueOf(randomOTP()));

        mycountdown = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TextView myWarning = findViewById(R.id.Timer);
                myWarning.setText("Warning! your otp expires in " + millisUntilFinished / 1000 + " Seconds");
            }

            @Override
            public void onFinish() {
                otpmsg.setText(String.valueOf(randomOTP()));
                mycountdown.cancel();

            }

        };
        mycountdown.start();
    }
}