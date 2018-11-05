

public class MainQueueGeneric {
	public static void main(String[] args) {
		QueueGeneric <Integer> sc = new QueueGeneric <Integer>();

			    sc.insert(1);
			    sc.insert(2);
			    sc.insert(3);
			    System.out.print("Hasil :");
			    System.out.println(sc.remove());
			}
}
