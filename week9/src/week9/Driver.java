package week9;

import java.util.ArrayList;

import week9.dao.ProductDao;
import week9.vo.Product;
import week9.vo.Result;

public class Driver {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		ArrayList<Product>list=dao.inputFromKeyBoard();
		Result result=dao.process(list);
		dao.output(list,result);
	}

}
