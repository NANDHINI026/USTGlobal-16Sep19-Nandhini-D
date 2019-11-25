
package com.ustglobal.assessment.util;

import com.ustglobal.assessment.dao.InformationDAO;
import com.ustglobal.assessment.dao.InformationDAOImpl;

public class InformationManager {
	private InformationManager() {}

	public static InformationDAO getInformationDAO(){
		return new InformationDAOImpl();

	}

}



