import java.util.Scanner;

public class Countthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=2345;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the number");
		int a=sc.nextInt();
		
		while(a>0) {
			
			a=a/10; //234 //23 //2
			count++;//1 //2 //3 //4
			
			
			//System.out.println(count);//
			}
		
		System.out.println(count);
	}

}
