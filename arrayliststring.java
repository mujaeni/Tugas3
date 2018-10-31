import java.util.ArrayList;

public class arrayliststring {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("abdi");
		string.add("anugrah");
		string.add("habib");
		System.out.println(string.toString());
		System.out.println("index of anugrah : "+string.indexOf("anugrah"));
		string.remove(2);
		System.out.println(string.toString());
		System.out.println("size : "+string.size());
		
	}

}
