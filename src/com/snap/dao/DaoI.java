package com.snap.dao;

import java.util.List;
import java.util.Set;

import com.snap.entity.Emp;
import com.snap.vo.User;

public interface DaoI {
	public int saveEmployee(Emp emp);
	public Emp getEmp(int eid);
	public int updateSal(int eid, double sal);
	public List<Emp> viewEmployees(String dept);
	public List<Emp> viewEmployees();
	public Set<String> getDepts();
	public boolean getUser(User u);
	
}
