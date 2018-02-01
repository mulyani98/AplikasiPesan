package com.example.d2j_00.aplikasipesan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        TextView showPesan = (TextView) findViewById(R.id.show_pesan);
        Intent it = getIntent();
        String pesan = it.getStringExtra("main.pesan");
        showPesan.setText(pesan);
    }
}
