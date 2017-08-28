package com.example.shikhar.login_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eduser;
    EditText edpwd;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        eduser = (EditText) findViewById(R.id.edusername);
        edpwd = (EditText) findViewById(R.id.edpassword);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user, pass;
                user = eduser.getText().toString();
                pass = edpwd.getText().toString();

                if (user.equals("Shikhar") && pass.equals("123")) {
                    Intent i = new Intent(MainActivity.this, Second.class);
                    i.putExtra("name", user);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
