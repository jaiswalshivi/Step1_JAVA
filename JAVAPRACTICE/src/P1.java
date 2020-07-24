
public class P1 {
	int a=6;
	
	public String M1(){
		
		 System.out.println("Hello");
		 
		 return "Hi";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
P1 obj=new P1();
P2 obj1 =new P2();
obj1.M2();  //Calling methods from other class
		obj.M1();
		
	}

}
