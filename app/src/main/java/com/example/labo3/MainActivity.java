package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.labo3.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mUser, mPass, mGender, mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findVariables();
        mButton.setOnClickListener(v->{
            if(Verificacion()){

                Intent mIntent = new Intent(MainActivity.this,Main2Activity.class);
                mIntent.putExtra(AppConstants.TEXT_KEY, mUser.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY3, mEmail.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY2, mPass.getText().toString() );
                mIntent.putExtra(AppConstants.TEXT_KEY4, mGender.getText().toString() );
                startActivity(mIntent);
            }
        });
    }

    public void findVariables(){
        mButton = findViewById(R.id.bt_send);
        mUser = findViewById(R.id.et_user);
        mEmail = findViewById(R.id.et_email);
        mPass = findViewById(R.id.et_pass);
        mGender = findViewById(R.id.et_gender);
    }

    public Boolean Verificacion(){
        int cont = 0;
        if(mUser.getText().toString().equalsIgnoreCase("") ){
            mUser.setError("Obligatorio");
            cont++;
        }
        if(mPass.getText().toString().equalsIgnoreCase("") ){
            mPass.setError("Obligatorio");
            cont++;
        }
        if(mEmail.getText().toString().equalsIgnoreCase("") ){
            mEmail.setError("Obligatorio");
            cont++;
        }
        if(mGender.getText().toString().equalsIgnoreCase("")){
            mGender.setError("Obligatorio");
            cont++;
        }
        if(cont==0){
            return true;
        }else{
            return false;
        }


    }
}
