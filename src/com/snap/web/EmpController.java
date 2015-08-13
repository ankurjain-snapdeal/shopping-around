package com.snap.web;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snap.dao.DaoI;
import com.snap.entity.Emp;

@Controller
public class EmpController {
	private DaoI dao;
	
	@Autowired
	public void setDao(DaoI dao) {
		this.dao = dao;
	}

	@RequestMapping(value="viewall.htm", method=RequestMethod.GET)
	public String viewAllEmps(Model model) {
		List<Emp> lst = dao.viewEmployees();
		model.addAttribute("elist", lst);
		return "EmpView";
	}

	@RequestMapping(value="viewdept.htm", method= RequestMethod.GET)
	public String displayCatFrm(Model model){
		model.addAttribute("employee",new Emp());
		model.addAttribute("dlist", dao.getDepts());
		return "CatFrm";
	}
	
	@RequestMapping(value="dept.htm", method= RequestMethod.POST)
	public String processCatFrm(@ModelAttribute("employee") Emp emp, Model model){
		List<Emp> lst = dao.viewEmployees(emp.getDept());
		model.addAttribute("elist",lst);
		return "EmpView";
	}
	


}
