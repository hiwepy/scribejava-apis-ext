package com.github.scribejava.apis.service;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.OAuth20Service;

/**
 */
public class OschinaOAuth20ServiceImpl extends OAuth20Service {

    public OschinaOAuth20ServiceImpl(DefaultApi20 api, OAuthConfig config) {
        super(api, config);
    }

    @Override
    protected OAuthRequest createAccessTokenRequest(String code, String pkceCodeVerifier) {
    	OAuthRequest request = super.createAccessTokenRequest(code, pkceCodeVerifier);
    	request.addParameter("dataType", "json");
    	return request;
    }
}
