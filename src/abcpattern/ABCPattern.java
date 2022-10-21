package abcpattern;

public class ABCPattern {
	
	public static void main(String[] args)
	 {
		// for(char a ='A';a<='F';a++) // no.of line printing upto F total 6 lines
		// {
			
			// for(char c='A'; c <= a; c++) // no. of char printing like A to F
			 //{ 
				// System.out.print(c+ " " );
			 //}
			 //System.out.println();
		 // }
		int line = 5;
		for(int a = 1;a<=line ;a++)
		 {
			char ch = 'A';
			 for(int c=1; c <= a; c++)
			 { 
				 System.out.print(ch+" " );
				 ch++;
			 }
			 System.out.println();
}
	 }
}
