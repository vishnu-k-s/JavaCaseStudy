package ex2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addbookinghotel {
	
	static int room=0;
	int h=0;
	static Scanner s=new Scanner(System.in);
	void CheckStatus(int roomID)
	{
		int f=roomID;
		bookinghotel newClassObj = new bookinghotel();
		int[] secondArray = newClassObj.getNumArray();
								
			if(1==secondArray[f-1])
			{				 
				System.out.println("room is booked");			
			}
			else {				
				System.out.println("room is not booked");							
		    }						
	}
	public static void main(String args[]) throws IOException
	{
		do {
		System.out.println("Menu\n1. Book\n2. Check Status\n3. Exit\nEnter your choice:");
		
		int choice=s.nextInt();	
		
			switch(choice)
			{
			case 2:
			   System.out.println("Enter room number");
			   int num=s.nextInt();
			   addbookinghotel c=new addbookinghotel();
			   c.CheckStatus(num);
			   break;	
			case 1:bookinghotel b=new bookinghotel();
			   String ac="null";
			   String cot="null";
			   String cable="null";
			   String wifi="null";
			   String laundry="null";
			   b.book(ac,cot,cable,wifi,laundry);
			   
			   break;	
			case 3:
				 System.exit(0);
				 break;
				
			default:break;					
		}
		}while(true);		
}}
