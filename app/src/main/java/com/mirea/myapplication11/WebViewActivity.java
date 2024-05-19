package com.mirea.myapplication11;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    private WebView webView; // Объявление приватного объекта WebView для доступа к нему внутри класса

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webview); // Нахождение объекта WebView внутри макета по его ID
        webView.setWebViewClient(new WebViewClient()); // Установка объекта WebViewClient для обработки событий внутри WebView
        webView.getSettings().setJavaScriptEnabled(true); // Разрешение выполнения JavaScript-кода внутри WebView
        webView.loadUrl("https://vk.com/lovel4"); // Загрузка веб-страницы по указанному URL внутри WebView
    }
}