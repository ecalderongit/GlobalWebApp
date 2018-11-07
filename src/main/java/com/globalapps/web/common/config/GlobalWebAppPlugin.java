package com.globalapps.web.common.config;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class GlobalWebAppPlugin implements PlugIn {

	@Override
	public void destroy() {
	}

	@Override
	public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
		PathTool.setContext(servlet.getServletContext());
		
	}

}
