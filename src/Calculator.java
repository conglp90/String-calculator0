import java.util.ArrayList;


public class Calculator {
	ArrayList<Integer> sohang_list=new ArrayList<Integer>();
	String delimitter="";
	
	
	void process_laySoHang(String input){// xu ly xau co dang 1,2,3,4
		for (String temp :input.split(","))
			sohang_list.add(Integer.parseInt(temp));
	}
	
	private String process_delimiter(String input) {
		String kq;
		if (input.contains("//")) {
			delimitter=input.substring(input.indexOf("[")+1,input.indexOf("]"));
			input=input.substring(input.indexOf("\n")+1);
			input=input.replaceAll(delimitter,",");
		} 
		kq=input.replaceAll("\n",",");
		return kq;
	}
	
	int add(String input){
		int kq=0;
		try {
			process_laySoHang( process_delimiter(input));
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
		for(int sohang: sohang_list)
			kq+=sohang;
		return kq;
	}
	
}
