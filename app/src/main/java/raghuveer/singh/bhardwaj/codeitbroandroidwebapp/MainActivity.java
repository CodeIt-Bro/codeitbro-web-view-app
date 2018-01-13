package raghuveer.singh.bhardwaj.codeitbroandroidwebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.codeitbro_web_view);
        mWebView.loadUrl("https://codeitbro.com");
        /// URL To Binding Test Website is https://raghuveer-singh-bhardwaj.github.io/ss.html
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); //Enables JavaScript
        webSettings.setBuiltInZoomControls(true);
        mWebView.addJavascriptInterface(new WebAppInterface(this),"Android"); //Binds Android app with Website
    }
}
