package com.example.d2j_00.aplikasipesan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View v){
//        EditText inpPesan = (EditText) findViewById(R.id.inp_pesan);
//        TextView txtPesan = (TextView) findViewById(R.id.txt_pesan);

//        String Pesan = inpPesan.getText().toString();

//        txtPesan.setText(Pesan);
//        Toast.makeText(this, Pesan, Toast.LENGTH_LONG).show();
//        Log.d("show.pesan", Pesan);

//        Intent it = new Intent(this, ShowMessage.class);
//        it.putExtra("main.pesan", Pesan); //opsional mengirimkan sesuatu dg menggunakan key main.pesan
//        startActivity(it);

    }

    public void callPhone(View v){
        EditText inpTelp = (EditText) findViewById(R.id.inp_tlp);

        String telp = inpTelp.getText().toString();

        Uri uri = Uri.parse("tel:"+telp);
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}
