import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner sc=new Scanner(System.in);
		System.out.println("Print number");
		int a=sc.nextInt();
		//int a=458;//
		int rev=0;//45
		//System.out.println(a);
		while(a!=0) {
			rev=rev*10+a%10;//
			a=a/10;
			
		}
		
		System.out.println(rev);
	}

}
