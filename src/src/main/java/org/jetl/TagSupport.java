package org.jetl;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public abstract class TagSupport extends SimpleTagSupport {

	protected JspWriter out;
	protected PageContext pageContext;
	
	@Override
	public void doTag() throws JspException, IOException {
		pageContext = (PageContext)getJspContext();
		out = pageContext.getOut();
	}
	
	protected String stylesheet(String style) {
		return "<style>" + style + "</style>";
	}

	protected String javascript(String script) {
		return "<script type=\"text/javascript\">" + script + "</script>";
	}
	
}