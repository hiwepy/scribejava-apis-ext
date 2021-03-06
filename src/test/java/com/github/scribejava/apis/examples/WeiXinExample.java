/*
 * 版权所有.(c)2008-2018. 极蚁网络工作室 (http://jeebiz.net).
 */
package com.github.scribejava.apis.examples;


import com.github.scribejava.apis.WeiXinApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class WeiXinExample {

	public static void main(String[] args) {

		final String apiKey = "x";
		final String apiSecret = "x ";
		final OAuth20Service service = new ServiceBuilder(null).apiKey(apiKey).apiSecret(apiSecret)
				.callback("url").defaultScope("snsapi_login")
				.build(WeiXinApi20.instance());
		
		System.out.println(service.getAuthorizationUrl());
	}
	
}
