
public class ReverseString {
	
	public static void main(String[] args) {

		String a="madam"; // at backend an object a will be created of class string
		String h="";
		
		//System.out.println("This is Palindrome");
		
		for (int i=a.length()-1;i>=0;i--) {
			
		
			h=h+a.charAt(i);
			
		}
		
		System.out.println(h);
		System.out.println(a);
		
if (a==h)   //here we're comparing refrences

{
			
			System.out.println("This is Palindrome");
		}

if (a.equals(h)) // here comparing value within object a & h
{
	
	System.out.println("This is jjj Palindrome");
}
		
		else {
			
			System.out.println("Wrong programming");
		}
}

}