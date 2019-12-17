package com.ustglobal.exception.Second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {
	void open() throws IOException, ClassNotFoundException, SQLException {
		File f = new File("a.txt");
		f.createNewFile();

		Class.forName("com.a");
	}
}
