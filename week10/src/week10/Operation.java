package week10;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个表达式:");
		String s = scan.nextLine();
		ArrayList<String> openList = new ArrayList<String>();
		openList.add(s);
		String pattern = "(add|sub|max|min|doubleMe)\\(\\d*(,|，)?(.*)\\)";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(s);
		boolean hasOpe = matcher.find();
		if(hasOpe == true) {
			while(hasOpe) {
				String group = matcher.group(3);
				openList.add(group);
				matcher = p.matcher(group);
				hasOpe = matcher.find();
			}
		}
		openList.remove(openList.size()-1);
		ArrayList<String> opeList2 = new ArrayList<String>();
		String ope2;
		int answer = 0;
		for(int i=0;i<openList.size();i++)
		{
			opeList2.add(openList.get(i));
		}

		for(int i=openList.size()-1;i>=0;i--) {

			String ope = openList.get(i);
			System.out.print(opeList2.get(i)+"=");
			answer = getanswer(ope);
			System.out.println(answer);
			if(i == 0)
				break;
			String Answer = String.valueOf(answer);
			ope2 = openList.get(i-1);
			String ope3 = ope2.replace(opeList2.get(i), Answer);	
			openList.set(i-1, ope3);
		}

		System.out.println("结果为："+s+"="+answer);
	}

	public static int getanswer(String s) {
		int pos1 = s.indexOf("(");
		String operateCode = s.substring(0,pos1);
		int pos2,pos3;
		int number1=0,number2=0;
		pos3 = s.indexOf(")");
		if(operateCode.equals("doubleMe")){
			number1 = Integer.parseInt(s.substring(pos1+1,pos3).trim());
		}
		else if(operateCode.equals("add")||operateCode.equals("sub")||operateCode.equals("max")||operateCode.equals("min")){
			pos2 = s.indexOf(",");
			number1 = Integer.parseInt(s.substring(pos1+1,pos2).trim());
			number2 = Integer.parseInt(s.substring(pos2+1,pos3).trim());
		}
		else{}
		int result=0;
		switch(operateCode){
		case "doubleMe":
			result = number1*2;break;
		case "add":
			result = number1+number2;break;
		case "sub":
			result = number1-number2;break;
		case "max":
			result = number1>number2?number1:number2;break;
		case "min":
			result = number1<number2?number1:number2;break;
		}
		return result;
	}

}
