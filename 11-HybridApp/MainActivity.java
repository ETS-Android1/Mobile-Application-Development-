package com.example.hybridapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    EditText url;
    WebView webView;
    Button load,file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url=findViewById(R.id.url);
        webView=findViewById(R.id.webview);
        load = findViewById(R.id.load);
        file = findViewById(R.id.files);

        webView.setWebViewClient(new WebViewClient());
        WebSettings websettings= webView.getSettings();
        websettings.setJavaScriptEnabled(true);

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //requestPermissions(new String[]{Manifest.permission.ACCESS_NETWORK_STATE});
        //}

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //requestPermissions(new String[]{Manifest.permission.INTERNET});
        //}

        load.setOnClickListener(new View.OnClickListener() {

            String url_=url.getText().toString();
            @Override
            public void onClick(View view) {
                try{
                    //webView.loadUrl("https://www.google.com");
                    webView.loadUrl(url_);
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    webView.loadUrl("file:///android_asset/sample.html");
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
