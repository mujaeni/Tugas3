public class classmainstuckdouble {

	
	public static void main(String[] args) {
		classstackdouble sc=new classstackdouble();
		sc.push(2.3);
		sc.cetak();
		sc.push(0.0);
		
		sc.cetak();
		
		double d0=sc.pop();
		System.out.println(d0);
		double d1=sc.pop();
		System.out.println(d1);
		sc.cetak();
		double d2=sc.pop();
		System.out.println("kosong");

	}

}
