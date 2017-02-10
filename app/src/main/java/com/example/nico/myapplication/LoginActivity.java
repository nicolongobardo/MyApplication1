package com.example.nico.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {
    EditText usernameET;
    EditText passwordET;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameET = (EditText) findViewById(R.id.login_us);
        passwordET = (EditText) findViewById(R.id.login_pwd);
        loginBtn = (Button) findViewById(R.id.button);

        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button ) {
            if (((usernameET.getText().toString().length() > 0) && passwordET.getText().toString().length() > 0)) {
                String name = usernameET.getText().toString();
                String password = passwordET.getText().toString();
                if (doLogin(name, password)) {
                    Toast.makeText(LoginActivity.this, getString(R.string.login_success), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    this.finish();
                }
            }
        }
    }

    private boolean doLogin(String name,String password){
        return true;
    }
}
