package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "Main Activity 2";
    private String username;
    private String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent receiving = getIntent();
        username = receiving.getStringExtra("Username");
        password = receiving.getStringExtra("Password");
        Log.v(TAG, receiving.toString());
        TextView myTextview = findViewById(R.id.textView4);
        myTextview.setText(username + password);

        ImageView myimageview = findViewById(R.id.imageView1);
        /*myimageview.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/"));*/
        /*This is to create image view*/
        /*MediaPlayer mymedia = MediaPlayer.create(this, R.raw.video_name)
        *mymedia.start(); */
    }
}