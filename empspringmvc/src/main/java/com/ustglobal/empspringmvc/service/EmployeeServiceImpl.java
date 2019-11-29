package com.ustglobal.empspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.empspringmvc.dao.EmployeeDAO;
import com.ustglobal.empspringmvc.dto.EmployeeBean;
//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService{
	//private EmployeeDAO dao = new EmployeeDAOImpl();
@Autowired
private EmployeeDAO dao;
	public EmployeeBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	public int register(EmployeeBean bean) {
		//logic to check email and password
		return dao.register(bean);
	}

	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	public EmployeeBean searchEmployee(int id) {
		
		return dao.searchEmployee(id);
	}

	public boolean updateEmployee(EmployeeBean bean) {
		
		return dao.updateEmployee(bean);
	}

	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

}
