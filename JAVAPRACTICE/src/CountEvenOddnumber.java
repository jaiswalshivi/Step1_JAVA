import java.util.Scanner;

public class CountEvenOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=91;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: a");
		int a=sc.nextInt();
		
		
		int even=0;
		int odd=0;
		int b=0;
		
		while(a>0) {
			b=a%10;//2 //6  //5 //7
			a=a/10;//756 //75  //7 //0
			//
			if(b%2==0) {
				even++;
				}
			
			else {
				odd++;
			}
			
		}
System.out.println("Even "+ even);
System.out.println("Odd "+odd);
	}

}
