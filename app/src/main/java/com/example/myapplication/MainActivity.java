package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.EditTextUsername);
        password = findViewById(R.id.EditTextPassword);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pwd = password.getText().toString();

                if (user.matches("sanika") && pwd.matches("123")) {
                    Toast.makeText(MainActivity.this, "welcome" + user, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect password/username", Toast.LENGTH_LONG).show();
                    username.requestFocus();
            }
        });
    });
}

