package files;

import java.io.*;

public class Files {
	
	public void infile(String inname)throws IOException {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(inname);
		}finally{
			if (in != null) {
	            in.close();
			}
		}
		
	}

}
