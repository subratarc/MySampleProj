package com.my.emp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.my.emp.dao.EmpDao;
import com.my.emp.model.Emp;
import com.my.util.CustomHibernateDaoSupport;

@Repository("empDao")
@Transactional(readOnly=false)

public class EmpDaoImpl extends CustomHibernateDaoSupport implements EmpDao {
	
	public void save(Emp emp){
		getHibernateTemplate().save(emp);
	}

	public void update(Emp emp){
		getHibernateTemplate().update(emp);
	}

	public void delete(Emp emp){
		getHibernateTemplate().delete(emp);
	}
	
	public Emp findByDName(String dName){
		List list = getHibernateTemplate().find(
                     "from Emp where dName=?",dName
                );
		return (Emp)list.get(0);
	}


}
