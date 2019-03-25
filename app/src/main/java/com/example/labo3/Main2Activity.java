package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.labo3.utilities.AppConstants;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    Button mButton;
    TextView userR,passR,emailR,genderR;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findVariables();

        Intent mIntent = getIntent();

        if (mIntent!=null) {
            userR.setText("User: "+mIntent.getStringExtra(AppConstants.TEXT_KEY));
            passR.setText("Pass: "+ mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            emailR.setText("Email: "+mIntent.getStringExtra(AppConstants.TEXT_KEY3));
            genderR.setText("Gender: "+mIntent.getStringExtra(AppConstants.TEXT_KEY4));

        }



        mButton.setOnClickListener(v->{
            resultado ="User: "+mIntent.getStringExtra(AppConstants.TEXT_KEY) + "\n"+"Pass: "+ mIntent.getStringExtra(AppConstants.TEXT_KEY2) + "\n"+"Email: "+mIntent.getStringExtra(AppConstants.TEXT_KEY3) + "\n" +"Gender: "+mIntent.getStringExtra(AppConstants.TEXT_KEY4);
            Intent mIntent2 = new Intent();
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.setType("text/plain");
            mIntent2.putExtra(Intent.EXTRA_TEXT,resultado);
            startActivity(mIntent2);

        });


    }

    public void findVariables(){
        mButton = findViewById(R.id.bt_share);
        userR = findViewById(R.id.tv_result_user);
        passR = findViewById(R.id.tv_result_pass);
        genderR = findViewById(R.id.tv_result_gender);
        emailR = findViewById(R.id.tv_result_email);

    }
}
