package week8;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean passwordOk = false;
		while (!passwordOk) {
			System.out.println("Enter your password");
			System.out.println("������8-15֮��");
			System.out.println("�����пո�");
			System.out.println("������һ����д��һ��Сд��һ������");
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
				System.out.println("�������Ҫ��");
				passwordOk=true;
			}
				else {
				if (!lengthOk)
					System.out.println("���볤�Ȳ�����");
				if (hasSpace)
					System.out.println("���벻���пո�");
				if (!hasUpper)
					System.out.println("����û�д�д");
				if (!hasLow)
					System.out.println("����û��Сд");
				if (!hasNum)
					System.out.println("����û������");
				System.out.println("����������");
			}

		}
	}
}
