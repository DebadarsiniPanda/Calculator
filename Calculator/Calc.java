package Calculator;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			double a,b,res;
			char choice=0;
			Scanner S=new Scanner(System.in);
			
			System.out.println("------------CALCULATOR------------\n\n");
			do
			{
				
				System.out.println("\n\nChoose Option: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
				System.out.print("Enter your choice : ");
				choice=S.next().charAt(0);
			
				switch(choice)
				{ 
				    case '1':	
				    	Addition ad =new Addition();
				    	break;
				     
				     case '2':
				    	Subtraction sub =new Subtraction();
				    	break;
					    
				     case '3':
				    	 Multiplication mul =new Multiplication();
				    	 break;
					    
				     case '4':
				    	 Division div =new Division();
						 break;
					   
				     case '5':
						 System.exit(0);
						 break;
					 default : 
						 System.out.print("Wrong Choice.....\n");
						 break;
				}
			
		    }
			
		  while(choice!=5);
			S.close();
			
			
		}
	}