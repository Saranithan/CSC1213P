import java.util.Scanner;
class Switch01{
public static void main(String [] args){
	
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a letter :");
	char X = sc.next().charAt(0);
	switch(X)
	{
	 case 'A':
     case 'a':System.out.print("This is vowel letter");
		     break;
	 case 'E':
     case 'e':System.out.print("This is vowel letter");
		     break;
	 case 'I':
     case 'i':System.out.print("This is vowel letter");
		     break;
	 case 'O':
     case 'o':System.out.print("This is vowel letter");
		     break;
	 case 'U':
     case 'u':System.out.print("This is vowel letter");
		     break;
			 
	default:System.out.print("This is not vowel letter");
	}
}
}