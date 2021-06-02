package week11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Pattern;


public class Express {
	public static void main(String[] args) {
		String express ="add(min(12,3),max(2,sub(2,1)))";
		String regex="((add)|(sub)|(max)|(min)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(express);
		String result=express;
		while(m.find())
		{
			String basicExpress=m.group();
			String s=cal(basicExpress);
			System.out.println(basicExpress+"="+s);
			basicExpress=basicExpress.replace("\\(","\\\\(");
			basicExpress=basicExpress.replace("\\)","\\\\)");
			System.out.println("表达式为:"+result);
			result=result.replace(basicExpress, s);
			System.out.println("替换后:"+result);
			m=p.matcher(result);
		}
		System.out.println("运算结果:");
		System.out.println(express+"="+result);
	}
	}
public static String cal(String express){
	String result = "";
	String code = express.substring(0,express.indexOf("("));
	switch(code){
	case "add":{
		String num1 = express.substring(ope.indexOf("(")+1,express.indexOf(","));
		String num2 = express.substring(ope.indexOf(",")+1,express.indexOf(")"));
		int rnum1 = Integer.valueOf(num1);
		int rnum2 = Integer.valueOf(num2);
		result = String.valueOf(rnum1+rnum2);
		break;
	}
	
	case "sub":{
		String num1 = express.substring(express.indexOf("(")+1,express.indexOf(","));
		String num2 = express.substring(express.indexOf(",")+1,express.indexOf(")"));
		int rnum1 = Integer.valueOf(num1);
		int rnum2 = Integer.valueOf(num2);
		result = String.valueOf(rnum1-rnum2);
		break;
	}
	case "max":{
		String num1 = express.substring(ope.indexOf("(")+1,express.indexOf(","));
		String num2 = express.substring(ope.indexOf(",")+1,express.indexOf(")"));
		int rnum1 = Integer.valueOf(num1);
		int rnum2 = Integer.valueOf(num2);
		result = String.valueOf(rnum1>rnum2?rnum1:rnum2);
		break;
	}
	case "min":{
		String num1 = express.substring(express.indexOf("(")+1,express.indexOf(","));
		String num2 = express.substring(express.indexOf(",")+1,express.indexOf(")"));
		int rnum1 = Integer.valueOf(num1);
		int rnum2 = Integer.valueOf(num2);
		result = String.valueOf(rnum1<rnum2?rnum1:rnum2);
		break;
	}
	case "doubleMe":{
		String num = express.substring(express.indexOf("(")+1,express.indexOf(")"));
		int rnum = Integer.valueOf(num);
		result = String.valueOf(rnum*2);
	}
	}
	return result;
}

}
