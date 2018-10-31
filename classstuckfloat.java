public class classstuckfloat {
	ArrayList<Float>st=new ArrayList<Float>();
	public int top=-1;
	
	public void push(float value){
		top++;
		st.add(top,value);
	}
	public float pop(){
		float value=top;
		if (top>-1){
			value = st.get(top);
			st.remove(top);
			top--;
		}
		return value;}
		public void cetak(){
	System.out.println(st.toString());
		}
}
