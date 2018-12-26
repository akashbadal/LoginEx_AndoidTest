package com.example.akash.loginexmpl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static TextView attempt;
    private static Button   login_btn;
     int atmpt_counter =3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton();
    }

    public void loginbutton(){

        username =(EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        attempt = (TextView)findViewById(R.id.textView6);
        login_btn =(Button)findViewById(R.id.button);

        attempt.setText(Integer.toString(atmpt_counter));

       login_btn.setOnClickListener(
            new View.OnClickListener(){

                public void onClick(View v){
                    if(username.getText().toString().equals("Akash") && password.getText().toString().equals("1234"))
                    {
                        Toast.makeText(MainActivity.this,"Username and Password is correct",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("com.example.akash.loginexmpl.useractivity");
                        startActivity(intent);
                    }
                    else if(username.getText().toString().equals("Akash") && password.getText().toString().equals("9999"))
                    {
                        Toast.makeText(MainActivity.this,"Username and Password is correct",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("com.example.akash.loginexmpl.List_View");
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Username and Password is incorrect", Toast.LENGTH_SHORT).show();
                        atmpt_counter--;
                        attempt.setText(Integer.toString(atmpt_counter));

                        if (atmpt_counter == 0) {
                            login_btn.setEnabled(false);

                        }
                    }
                }


            }
       );
    }



}
