

package com.ustglobal.assessment.dao;

import java.util.List;

import com.ustglobal.assessment.dto.InformationBean;

public interface InformationDAO {

	public List<String> getAllContactNames();
	public InformationBean searchForContact(String name);


}


