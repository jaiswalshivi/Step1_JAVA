import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:  ");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		
		
//int a=9080;
int sum=0;
int y;




while (a>0)
{
	y = a%10; //
	sum= sum+y;
	a=a/10;
	}

System.out.println(sum);
	}

}
