package com.example.myapplication10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView=findViewById(R.id.web);
        webView.loadUrl("https://www.javatpoint.com/");

    }
}