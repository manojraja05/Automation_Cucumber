package com.property;

import java.io.IOException;

public class FileReader {
	private void FileReader() {
		
	}
	public static FileReader getInstanceFrm() {
		
		FileReader fr = new FileReader();
		return fr;
	}
	
	public Config_Reader getInstanceCR() throws IOException {
		Config_Reader reader = new Config_Reader();
		return reader;
	}

}
