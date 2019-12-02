package ex2;
import java.io.IOException;
import java.util.*;
public class cs6 {

	public static int reg=0,nm=1;
	static int custom[]=new int[25];
	static String na[]=new String[25];
	public static void main(String args[]) throws IOException {
		String name;
		String address;
		Long contactno;
		String emailid;
		String proof;
		String proofid;
		String a;
		String d;		
		int ch;		
		Scanner s=new Scanner(System.in);
		System.out.println("SELECT YOUR OPTION");
		System.out.println("\n1.REGISTRATION\n2.VIEW ALL BOOKING");
		ch=s.nextInt();
		switch(ch) {
		case 1:
		do
		{
		
		System.out.println("     REGISTRATION");
		System.out.print("Enter your name:");
		     name=s.next();
		     na[nm-1]=(String) name;//.toCharArray();
		     nm++;
		System.out.print("Enter your address:");
		address=s.next();
		System.out.print("Enter your Contact Number:");
		    contactno=s.nextLong();
		System.out.print("Enter your E-Mail ID:");
		emailid=s.next();
		System.out.print("Enter your proof type:");
		proof=s.next();
		System.out.print("Enter your proof ID:");
		proofid=s.next();
		System.out.println("Registered Successfully"+"Register Number is :"+ ++reg);
		custom[reg-1]=reg;		
		System.out.println("Do you want to Continue Registration(yes/no)");
		d=s.next();
		}
		while(d.equals("yes"));
		if(d.equals("no"))
		{
			cs6view t=new cs6view();
			t.datecs6();
		}
		break;
		case 2:
		cs6view t=new cs6view();
		t.datecs6();
		break;
		default:
			break;
		}
}
}
