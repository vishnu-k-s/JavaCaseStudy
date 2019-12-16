package ex2;
import java.util.Scanner;
public class cs6view {
	void datecs6() {
		System.out.println("            CUSTOMER LIST    ");
		System.out.println(" The registered customers are");
		System.out.print("\t CUST ID\t");
		System.out.println("CUST NAME");
		for(int i=0;i<cs6.reg;i++)
		{		 
			System.out.print("\t\t"+cs6.custom[i]+"\t");
			System.out.print(cs6.na[i]);
			System.out.println();		
		} 
		System.out.print("THANK YOU");
		}
}
