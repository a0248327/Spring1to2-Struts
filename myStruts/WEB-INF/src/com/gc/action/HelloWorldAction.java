package com.gc.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import org.springframework.context.ApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.gc.service.HelloWorldService;

//public class HelloWorldAction extends ActionSupport  {
//public class HelloWorldAction extends DispatchAction  {
public class HelloWorldAction extends Action {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private HelloWorldService helloWorldService;

	public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String msg = getHelloWorldService().addMsg((HelloWorld) form);
		request.setAttribute("helloWorld", msg);
		return mapping.findForward("show");
	}
}
