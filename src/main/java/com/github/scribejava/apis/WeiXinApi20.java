/*
 * 版权所有.(c)2008-2018. 极蚁网络工作室 (http://jeebiz.net).
 */
package com.github.scribejava.apis;

import com.github.scribejava.apis.service.ExtOAuth20Service;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.oauth.OAuth20Service;

public class WeiXinApi20 extends DefaultApi20 {

	private static final String AUTHORIZE_URL = "https://open.weixin.qq.com/connect/qrconnect";
	private static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";

	protected WeiXinApi20() {
	}

	private static class InstanceHolder {
		private static final WeiXinApi20 INSTANCE = new WeiXinApi20();
	}

	public static WeiXinApi20 instance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public String getAccessTokenEndpoint() {
		return ACCESS_TOKEN_URL;
	}
	
	@Override
	protected String getAuthorizationBaseUrl() {
		return AUTHORIZE_URL;
	}
	
	@Override
	public OAuth20Service createService(OAuthConfig config) {
		return new ExtOAuth20Service(this, config);
	}

}
