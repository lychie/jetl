package org.jetl;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.DynamicAttributes;

public abstract class TagSupport extends SimpleTagSupport implements DynamicAttributes {

	protected JspWriter out;
	protected PageContext pageContext;
	protected Map<String, String> attr = new HashMap<String, String>();
	
	@Override
	public void doTag() throws JspException, IOException {
		pageContext = (PageContext)getJspContext();
		out = pageContext.getOut();
	}

	@Override
	public void setDynamicAttribute(String uri, String name, Object value) throws JspException {
		attr.put(name, value.toString());
	}
	
	protected String attr(String name, String value) {
		return name + "=\"" + value + "\" ";
	}
	
	protected String getDynamicAttributes() {
		if(attr.size() == 0)
			return "";
		StringBuilder builder = new StringBuilder();
		for(String key : attr.keySet())
			builder.append(attr(key, attr.get(key)));
		return builder.toString();
	}
	
}