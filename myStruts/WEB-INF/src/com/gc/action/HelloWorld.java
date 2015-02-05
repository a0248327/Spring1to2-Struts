/*
 * Created on 2006-5-12
 * TODO
 * author:gf
 */
package com.gc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class HelloWorld extends ActionForm {
	private String msg = null;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public void reset(ActionMapping mapping, HttpServletRequest req) {
		this.msg = null;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if ("".equals(getMsg())) {
			errors.add("msg", new ActionError("error"));
		}
		return errors;
	}

}
