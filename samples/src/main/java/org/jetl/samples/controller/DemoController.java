package org.jetl.samples.controller;

import java.util.List;
import org.jetl.samples.entity.Person;
import org.jetl.samples.model.Data;
import org.jetl.samples.model.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("demo/page/{pageIndex}")
	public String pagination(@PathVariable Integer pageIndex, ModelMap model) {
		int pageSize = 2;
		int totalCount = Data.size();
		List<Person> result = Data.getPersonList(pageIndex, pageSize);
		Page<List<Person>> page = new Page<List<Person>>(pageIndex, pageSize, totalCount, result);
		model.put("p", page);
		return "list";
	}
	
}