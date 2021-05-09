package week9.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import week9.vo.Product;
import week9.vo.Result;

public class ProductDao {
	public ArrayList<Product> inputFromKeyBoard(){
		ArrayList<Product> list=new ArrayList<Product>();
		Scanner scan = new Scanner(System.in);
		String aLine = scan.nextLine();
		int seq=0;
		while (!aLine.equals("0000")) {
			String arr[] = aLine.split(",|，");
			String name = arr[0];
			float price = Float.parseFloat(arr[2]);
			int number = Integer.parseInt(arr[1]);
			float totalMoney = price * number;
			String sno = generateSno(String.valueOf(seq));
			Product product = new Product(sno, name, price, number, totalMoney);
			aLine = scan.nextLine();
			list.add(product);
		}	
	
		return list;
		
	}
	public Result process(ArrayList<Product> list){
		int saleNumber=0;
		int saleCount =0;
		float saleTotalMoney=0;
		for(int i=0;i<list.size();i++){
			Product product=list.get(i);
			saleCount=saleCount+product.getNumber();
			saleTotalMoney=saleTotalMoney+product.getTotalMoney();
		}
		Result result =new Result(saleNumber,saleCount,saleTotalMoney);
		return result;
		
	}

	public void output(ArrayList<Product> list,Result result){
		System.out.println("流水号\t\t商品名称\t单价\t商品数量\t总价");
		for(Product product:list){
			System.out.println(product.toString());
		}
		System.out.println(result.toString());
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
