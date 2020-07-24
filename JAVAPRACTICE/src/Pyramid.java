
public class Pyramid {

	
	//int L=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int k=1;
		for(int i=1;i<=4;i++) {		
			 for(int j=1;j<=5-i;j++) {
				 
				 System.out.print(k);
				 System.out.print("\t");
				 k++;
			 }
			System.out.println();
		}
		*/
		/*int length = 20;
		int number = 1;
		while (length>0)
		{
			for (int i=1;i<=length;i++,number++)
			{
				System.out.print(number+"\t");
			}
			System.out.println();
			length--;
		}*/
		
		int length = 1;
		int number = 1;
		while (length<20)
		{
			for (int i=1;i<=length;i++,number++)
			{
				System.out.print(number+"\t");
			}
			System.out.println();
			length++;
		}
	}
}
