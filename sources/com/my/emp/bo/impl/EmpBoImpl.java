package com.my.emp.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.emp.bo.EmpBo;
import com.my.emp.dao.EmpDao;
import com.my.emp.model.Emp;

@Service("empBo")

public class EmpBoImpl implements EmpBo{
	
	@Autowired
	EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public void save(Emp emp){
		empDao.save(emp);
	}

	public void update(Emp emp){
		empDao.update(emp);
	}

	public void delete(Emp emp){
		empDao.delete(emp);
	}

	public Emp findByDName(String DName){
		return empDao.findByDName(DName);
	}

}
