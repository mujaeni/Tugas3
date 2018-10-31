public class classmainqueuedouble {

	
	public static void main(String[] args) {
		classqueuedouble q=new classqueuedouble();
		q.cetak();
		q.insert(1.0);
		q.cetak();
		q.insert(2.0);
		q.cetak();
		q.insert(3.0);
		q.cetak();
		double d0=q.get();
		System.out.println(d0);


	}

}
