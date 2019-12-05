package com.ustglobal.empapp.dao;

import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	public ArrayList<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
}
