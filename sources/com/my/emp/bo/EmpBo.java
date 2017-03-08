package com.my.emp.bo;

import com.my.emp.model.Emp;

public interface EmpBo {
	
	void save(Emp emp);
	void update(Emp emp);
	void delete(Emp emp);
	Emp findByDName(String dName);

}
