package org.cebolton.www.cebase.activities.start;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.cebolton.www.cebase.R;
import org.cebolton.www.cebase.activities.loginregister.LogInRegisterScreen;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartScreen.this, LogInRegisterScreen.class);
                startActivity(i);
            }
        }, 3500);
    }
}
