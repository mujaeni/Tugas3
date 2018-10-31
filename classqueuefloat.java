import java.util.ArrayList;


public class classqueuefloat {
	ArrayList<Float>queue = new ArrayList<Float>();
	public int ecor = -1;
	
	public void insert(Float value){
		ecor++;
		queue.add(ecor,value);
	}
	
	public float get(){
		float value =ecor;
		if (ecor>-1){
			value = queue.get(0);
			queue.remove(0);
			ecor--;
		}
		return value;
	}
	
	public void cetak (){
		System.out.println("ECOR : "+ecor+" > variable : "+queue.toString());
}}
