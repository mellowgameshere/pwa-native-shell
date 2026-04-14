WebView webView = findViewById(R.id.webview);
webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setDomStorageEnabled(true);
webView.setWebViewClient(new WebViewClient());
webView.loadUrl("WEB_URL_PLACEHOLDER");
