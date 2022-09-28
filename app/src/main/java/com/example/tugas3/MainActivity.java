package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view) {
        String nomor = "0000000" ;
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "https://instagram.com/" ;
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }
    public void open(View view) {
        String url = "https://twitter.com/" ;
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }
    public void tentang(View view) {
        Intent tentang=new Intent(MainActivity.this, About.class);
        startActivity(tentang);
    }
}