package com.snap.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.snap.entity.Emp;

public class DaoImpl implements DaoI {

	private HibernateTemplate htemp;

	//setter for Dependency Injection
	public void setHtemp(HibernateTemplate htemp) {
		this.htemp = htemp;
	}

	@Override
	public int saveEmployee(Emp emp) {
		htemp.save(emp);
		return 1;
	}

	@Override
	public Emp getEmp(int eid) {
		Emp emp = (Emp)htemp.get(Emp.class,eid);
		return emp;
	}

	@Override
	public int updateSal(int eid, double sal) {
		Emp emp = (Emp)htemp.get(Emp.class, eid);
		emp.setEmpSal(sal);
		htemp.update(emp);
		return 0;
	}

	@Override
	public List<Emp> viewEmployees(String dept) {
		String hql = "from Emp where dept=?";
		Object[] params = {dept};
		List<Emp> lst =  htemp.find(hql,params);
		return lst;
	}

	@Override
	public List<Emp> viewEmployees() {
		String hql = "from Emp";
		List<Emp> lst = htemp.find(hql);
		return lst;
	}

	@Override
	public Set<String> getDepts() {
		//String hql = "select  dept from Emp group";
		String hql = "select distinct dept from Emp group";
		List<String> lst = htemp.find(hql);
		Set<String> set = new HashSet<String>();
		set.addAll(lst);
		return set;
	}

}
