import java.util.ArrayList;


public class classqueuedouble {
	ArrayList<Double>queue = new ArrayList<Double>();
	public int ecor = -1;
	
	public void insert(Double value){
		ecor++;
		queue.add(ecor,value);
	}
	
	public Double get(){
		double value = ecor;
		if (ecor>-1){
			value= queue.get(0);
			queue.remove(0);
			ecor--;
		}
		return value;
	}
	
	public void cetak (){
		System.out.println("ECOR : "+ecor+" > variable : "+queue.toString());
	}

}
