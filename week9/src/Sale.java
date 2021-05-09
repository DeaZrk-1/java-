

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import week9.vo.Product;

public class Sale {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入销售信息，以此为商品名称，商品单价，销售数量");
		String outInfo = "";
		String aLine = scan.nextLine();
		int seq=0;
		int totalNum=0;
		float totalPrice=0;
		while (!aLine.equals("0000")) {
			String arr[] = aLine.split(",|，");
			String name = arr[0];
			float price = Float.parseFloat(arr[2]);
			int number = Integer.parseInt(arr[1]);
			float totalMoney = price * number;
			String sno = generateSno(String.valueOf(seq));
			Product product = new Product(sno, name, price, number, totalMoney);
			totalNum=totalNum+product.getNumber();
			totalPrice=totalPrice+product.getTotalMoney();
			outInfo = outInfo + product.toString() + "\n";
			seq++;
			aLine = scan.nextLine();
		}

		System.out.println("流水号\t\t商品名称\t单价\t商品数量\t总价");
		System.out.println(outInfo);
		System.out.println("总计:销售笔数"+seq+",销售数量"+totalNum+",销售金额"+totalPrice);
	}

	public static String generateSno(String beforeNo) {
		String sno = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String prefix = df.format(new Date());
		String newNo = String.valueOf(Integer.parseInt(beforeNo) + 1);
		String zero = "";
		int zeroCount = 4 - newNo.length();
		for (int i = 0; i < zeroCount; i++) {
			zero = "0" + zero;
		}
		sno = prefix + zero + newNo;
		return sno;
	}

}
