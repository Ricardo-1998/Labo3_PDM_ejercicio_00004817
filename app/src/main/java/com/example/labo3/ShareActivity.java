package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mtext =findViewById(R.id.share);
        Intent mIntent = getIntent();
        if (mIntent !=null) {
            mtext.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }


}
