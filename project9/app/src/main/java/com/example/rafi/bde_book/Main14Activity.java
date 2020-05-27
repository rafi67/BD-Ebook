package com.example.rafi.bde_book;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main14Activity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webview = findViewById((R.id.Web));
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://drive.google.com/open?id=1vJfRMsoJDZ--jwIdq9ypcxxDXaRINbrO");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.reload:
                webview.loadUrl("https://drive.google.com/open?id=1vJfRMsoJDZ--jwIdq9ypcxxDXaRINbrO");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}

