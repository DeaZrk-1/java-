package week11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileTest {
	public static void main(String[] args) {
		try{
			String fileName="d:/1.txt";
			File afile =new File(fileName);
			FileReader fr=new FileReader(afile);
			BufferedReader bf=new BufferedReader(fr);
			String aLine="";
			while((aLine=bf.readLine())!=null)
			{
				System.out.println(aLine);
			}
			bf.close();
			fr.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
