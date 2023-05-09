package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textViewRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating objects for username,password,login and register
        EditText EditViewPassword=findViewById(R.id.editTextPassword);
        textViewRegister=(TextView)findViewById(R.id.textViewRegister);
        Button buttonLogIn=findViewById(R.id.buttonLogIn);
        EditText EditViewUserName=findViewById(R.id.editTextUserName);
//set click event listener
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//method you can put anything
                 String username=EditViewUserName.getText().toString();
                 String password=EditViewPassword.getText().toString();

                 //check for non empty filled
                if (username.length()!=0||password.length()!=0){
                    if (username.equals("joan")&&password.equals("pass")){
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Empty input field", Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(getApplicationContext(), "incorrect Username/password", Toast.LENGTH_LONG).show();
                }



            }
        });
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
            }
        });






    }

}
