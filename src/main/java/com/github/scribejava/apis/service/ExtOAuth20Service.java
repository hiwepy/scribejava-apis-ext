/*
 * 版权所有.(c)2008-2018. 极蚁网络工作室 (http://jeebiz.net).
 */
package com.github.scribejava.apis.service;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.AccessTokenRequestParams;
import com.github.scribejava.core.oauth.OAuth20Service;

public class ExtOAuth20Service extends OAuth20Service {

	public ExtOAuth20Service(DefaultApi20 api, String apiKey, String apiSecret, String callback, String defaultScope,
			String responseType, String userAgent, HttpClientConfig httpClientConfig, HttpClient httpClient) {
		super(api, apiKey, apiSecret, callback, defaultScope, responseType, userAgent, httpClientConfig, httpClient);
	}

	@Override
    protected OAuthRequest createAccessTokenRequest(AccessTokenRequestParams params) {
    	OAuthRequest request = super.createAccessTokenRequest(params);
    	request.addParameter("dataType", "json");
    	return request;
    }
   
}