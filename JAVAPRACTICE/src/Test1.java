import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String name="Jaiswal";
String surname="";

for(int i=name.length()-1;i>=0; i--) {
	
	surname=name.charAt(i);
}
System.out.println(surname);*/

//(int i=a.length()-1;i>=0;i--)
		
		
	/*	int funct;
		//int num;
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			funct=num*i;
			
			System.out.println( num +" x "+i +" = " + funct);
		} */
	/*	
	int a=2;	
		int b=2;
		int temp;
		temp=2%10;
		
		System.out.println(temp);  */ //DIFFERENCE BETWEEN % & /
	String name="Pine";
	String rev="";
	
	System.out.println(name.charAt(3));
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev + name.charAt(i);
		
	}
	System.out.println(rev);	
	}

}
