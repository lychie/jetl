package org.jetl;

import java.io.IOException;
import javax.servlet.jsp.JspException;

public class PaginationTag extends TagSupport {

	private String id = "pagination";
	private String link = "#";
	private String totalamount;
	private int currentpage;
	private String pageitems;
	private String btnchain = "10";
	private String btnedge = "0";
	private boolean dependent = true;
	private String callback = "function(page_index, jq){}";
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		doDependent();
		out.println("<div id=\"" + id + "\">");
		out.println("<script type=\"text/javascript\">");
		out.println("$(function(){");
		out.println("	$(\"#pagination\").pagination(" + totalamount + ", {");
		out.println("		items_per_page : " + pageitems + ",");
		out.println("		num_display_entries : " + btnchain + ",");
		out.println("		current_page : " + currentpage + ",");
		out.println("		num_edge_entries : " + btnedge + ",");
		out.println("		link_to : \"" + link + "\",");
		out.println("		callback : " + callback);
		out.println("	});");
		out.println("});");
		out.println("</script>");
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link.replace("_index_", "__id__");
	}

	public String getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage - 1;
	}

	public String getPageitems() {
		return pageitems;
	}

	public void setPageitems(String pageitems) {
		this.pageitems = pageitems;
	}

	public String getBtnchain() {
		return btnchain;
	}

	public void setBtnchain(String btnchain) {
		this.btnchain = btnchain;
	}

	public String getBtnedge() {
		return btnedge;
	}

	public void setBtnedge(String btnedge) {
		this.btnedge = btnedge;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDependent() {
		return dependent;
	}

	public void setDependent(boolean dependent) {
		this.dependent = dependent;
	}
	
	private void doDependent() throws JspException, IOException {
		if(dependent) {
			out.println("<link href=\"http://lychie.github.io/res/styles/pagination.css\" rel=\"stylesheet\" type=\"text/css\"/>");
			out.println("<script src=\"http://lychie.github.io/res/js/pagination.js\" type=\"text/javascript\"></script>");
		}
	}
	
}