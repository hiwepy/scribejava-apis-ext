package com.github.scribejava.apis.service;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.OAuth20Service;

/**
 */
public class OschinaOAuth20ServiceImpl extends OAuth20Service {

	public OschinaOAuth20ServiceImpl(DefaultApi20 api, String apiKey, String apiSecret, String callback, String scope,
			String state, String responseType, String userAgent, HttpClientConfig httpClientConfig,
			HttpClient httpClient) {
		super(api, apiKey, apiSecret, callback, scope, state, responseType, userAgent, httpClientConfig, httpClient);
	}
	
    @Override
    protected OAuthRequest createAccessTokenRequest(String code, String pkceCodeVerifier) {
    	OAuthRequest request = super.createAccessTokenRequest(code, pkceCodeVerifier);
    	request.addParameter("dataType", "json");
    	return request;
    }
}
