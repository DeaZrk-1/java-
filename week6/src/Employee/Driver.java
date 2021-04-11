package Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrator admin =new Administrator ("001","tom","1",4000f,2000f);
		SalePerson sp= new SalePerson("002","lasalu","2",5000f,20000f);
		System.out.println(admin.toString());
		System.out.println(sp.toString());
		admin.updateSalary();
		System.out.println(admin.getBaseSalary());
		sp.updateSalary();
		System.out.println(sp.getBaseSalary());

	}

}
