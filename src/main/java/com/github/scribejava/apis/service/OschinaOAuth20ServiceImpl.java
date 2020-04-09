package com.github.scribejava.apis.service;

import java.io.OutputStream;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.AccessTokenRequestParams;
import com.github.scribejava.core.oauth.OAuth20Service;

/**
 */
public class OschinaOAuth20ServiceImpl extends OAuth20Service {

	public OschinaOAuth20ServiceImpl(DefaultApi20 api, String apiKey, String apiSecret, String callback, String defaultScope,
            String responseType, OutputStream debugStream, String userAgent, HttpClientConfig httpClientConfig,
            HttpClient httpClient) {
		super(api, apiKey, apiSecret, callback, defaultScope, responseType, debugStream, userAgent, httpClientConfig, httpClient);
	}

	@Override
    protected OAuthRequest createAccessTokenRequest(AccessTokenRequestParams params) {
    	OAuthRequest request = super.createAccessTokenRequest(params);
    	request.addParameter("dataType", "json");
    	return request;
    }
	
}
