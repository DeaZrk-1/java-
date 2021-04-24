package week8;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean passwordOk = false;
		while (!passwordOk) {
			System.out.println("Enter your password");
			System.out.println("长度在8-15之间");
			System.out.println("不能有空格");
			System.out.println("至少有一个大写，一个小写，一个数字");
			Scanner scan = new Scanner(System.in);
			String password = scan.next();
			int len = password.length();
			boolean hasSpace = false;
			boolean hasUpper = false;
			boolean hasLow = false;
			boolean hasNum = false;
			boolean lengthOk = false;
			if (len >= 8 && len <= 15)
				lengthOk = true;
			for (int i = 0; i < len; i++) {
				char c = password.charAt(i);
				if (c == ' ')
					hasSpace = true;
				if (c >= 'A' && c <= 'Z')
					hasUpper = true;
				if (c >= 'a' && c <= 'z')
					hasLow = true;
				if (c >= '0' && c <= '9')
					hasNum = true;

			}
			if (!hasSpace && hasUpper & hasLow && hasNum)
			{
				System.out.println("密码符合要求");
				passwordOk=true;
			}
				else {
				if (!lengthOk)
					System.out.println("密码长度不符合");
				if (hasSpace)
					System.out.println("密码不能有空格");
				if (!hasUpper)
					System.out.println("密码没有大写");
				if (!hasLow)
					System.out.println("密码没有小写");
				if (!hasNum)
					System.out.println("密码没有数字");
				System.out.println("请重新输入");
			}

		}
	}
}
