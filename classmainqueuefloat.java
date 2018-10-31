public class classmainqueuefloat {

	
	public static void main(String[] args) {
		classqueuefloat q=new classqueuefloat();
		q.cetak();
		q.insert(1.0f);
		q.cetak();
		q.insert(2.0f);
		q.cetak();
		q.insert(3.0f);
		q.cetak();
		float d0=q.get();
		System.out.println(d0);

	}

}
