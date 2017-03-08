package com.my.emp.dao;

import com.my.emp.model.Emp;

public interface EmpDao {
	
	void save(Emp emp);
	void update(Emp emp);
	void delete(Emp emp);
	Emp findByDName(String dName);

}
