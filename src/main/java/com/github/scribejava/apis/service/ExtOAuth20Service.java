/*
 * 版权所有.(c)2008-2018. 极蚁网络工作室 (http://jeebiz.net).
 */
package com.github.scribejava.apis.service;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.OAuth20Service;

public class ExtOAuth20Service extends OAuth20Service {

    public ExtOAuth20Service(DefaultApi20 api, OAuthConfig config) {
        super(api, config);
    }
    
    @Override
    protected OAuthRequest createAccessTokenRequest(String code, String pkceCodeVerifier) {
    	OAuthRequest request = super.createAccessTokenRequest(code, pkceCodeVerifier);
    	request.addParameter("dataType", "json");
    	return request;
    }
   
}