/*
 * 版权所有.(c)2008-2018. 极蚁网络工作室 (http://jeebiz.net).
 */
package com.github.scribejava.apis.examples;

import com.github.scribejava.apis.OschinaApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class OsChinaExample {

	public static void main(String[] args) {

		final OAuth20Service oschina = new ServiceBuilder("ap4CsYvTlSbHcQYVaoSM").apiKey("ap4CsYvTlSbHcQYVaoSM")
				.apiSecret("tpgjHGhh4C5gPzFSMR8hcG9bDPMMfODH").callback("https://vindell.github.io")
				.responseType("code").build(OschinaApi20.instance());
		
		System.out.println(oschina.getAuthorizationUrl());
	}
}
