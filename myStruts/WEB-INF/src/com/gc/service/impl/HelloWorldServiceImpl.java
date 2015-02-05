/*
 * Created on 2006-5-15
 * TODO
 * author:gf
 */
package com.gc.service.impl;

import com.gc.action.HelloWorld;
import com.gc.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
	public String addMsg(HelloWorld helloWorld) {
		helloWorld.setMsg("ª∂”≠ π”√Spring " + helloWorld.getMsg());
		return helloWorld.getMsg();
	}
}
