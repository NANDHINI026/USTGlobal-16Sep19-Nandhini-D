package com.ustglobal.util;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {}//I never create object of this class(because method is static)
	
public static EmployeeDAO getEmployeeDAO() {
	return new EmployeeDAOImpl();
}
}
