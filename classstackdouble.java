import java.util.ArrayList;


public class classstackdouble {
	ArrayList<Double>st=new ArrayList<Double>();
	public int top = -1;
	
		public void push(Double value){
			top++;
			st.add(top,value);
		}
		
			public double pop() {
				double value=top;
			if (top>-1){				
				value = st.get(top);
				st.remove(top);
				top--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(st.toString());
			}
}
