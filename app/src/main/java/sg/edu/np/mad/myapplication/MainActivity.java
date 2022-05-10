package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main Activity";
    private static String etusername;
    private static String etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myloginbutton = findViewById(R.id.login);
        myloginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etmyusername = findViewById(R.id.Edit_Username);
                etusername = etmyusername.getText().toString();
                EditText etmypassword = findViewById(R.id.Edit_password);
                etpassword = etmypassword.getText().toString();
                User user = new User();
                user.setUsername(etusername);
                user.setPassword(etpassword);

               // Intent myintent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle myBundle = new Bundle();
                myBundle.putString("Username", user.getUsername());
                myBundle.putString("Password", user.getPassword());
               // myintent.putExtras(myBundle);
               // startActivity(myintent);
                Log.v(TAG, "Login: " + etusername + "  Password: " + etpassword);

                Intent myintent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(myintent);
            }
        });

    }
}