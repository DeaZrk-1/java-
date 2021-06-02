package week11;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class text {
	public static void main(String[] args) {
		String fileName="d:/123.txt";
		File oFl=new File(fileName);
		FileWriter fwt=new FileWriter(oFl);
		PrintWriter pwt=new PrintWriter(fwt);
		
	}

}
