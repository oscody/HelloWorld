package com.example.oneilbogle.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        Log.i("Info",myTextField.getText().toString());

        Toast.makeText(MainActivity.this, myTextField.getText().toString() , Toast.LENGTH_SHORT).show();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
