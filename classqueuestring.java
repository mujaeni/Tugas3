import java.util.ArrayList;
public class classqueuestring {
	
			ArrayList<String>sc = new ArrayList<String>();
			int ecor = -1;
			
			public void insert(String value){
				ecor++;
				sc.add(ecor,value);
			}
			
			public String get(){
				String value = "KOSONG";
				if (ecor>-1){
					value = sc.get(0);
					sc.remove(0);
					ecor--;
				}
				return value;
			}
			
			public void cetak (){
				System.out.println("ECOR : "+ecor+" > kelas B : "+sc.toString());
			}
	
}
