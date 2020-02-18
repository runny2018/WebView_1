package com.example.webview_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview=findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.google.com");
    }
}
