package com.leevicente.alertme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void buttonClickLogin(View v){
        Intent i;
        if (v.getId() == R.id.registerBtn) {
            i = new Intent(this, Register.class);
            startActivity(i);
        } else if (v.getId() == R.id.loginBtn) {
            i = new Intent(this, Main.class);
            startActivity(i);
        }
    }
}
