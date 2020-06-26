package finaljava;

import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a,name,address,father_name;
		String type;
		int b,c,d,e = 0,f,g;
		float x = 0;
		System.out.printf("If you want to work with Electricity bill Enter E or e\n");
		
		System.out.printf("If you want to work with Wifi bill Enter W or w\n");
		
		
		a=sc.nextLine();    
		if(a.charAt(0)=='E'||a.charAt(0)=='e')
		{
			
			System.out.printf("Enter the total number of customer\n");
			b=sc.nextInt();
			Electricity electricity[]=new Electricity[20];
			for(c=1;c<=10;c++)
			{
				electricity[c]=new Electricity("raju ahmed", c, 1824, "feni", "Nur", 'r', 0);
			}
			
			
			for(c=1;c<=b;c++)
			{
				System.out.printf("Enter the informatin for %d customer\n",c);
			
				System.out.printf("Enter Customer Name\n");
				
				char ch =sc.next().charAt(0);
				name=sc.nextLine();
		
				System.out.print("Enter Customer,s Mobile Number\n");
				d=sc.nextInt();
				
				
				char y;
				
				//y=sc.next().charAt(0);
				
				char q,w;
				
				
			//	w=sc.next().charAt(0);
				String father,addres;
				//w=sc.next().charAt(0);
				System.out.printf("Enter the Customer Father Name ::\n");
				
				w=sc.next().charAt(0);
				father=sc.nextLine();
				System.out.printf("Enter Customer Address :: \n");
				w=sc.next().charAt(0);
				addres=sc.nextLine();
      System.out.printf("Enter the customer meter category\nIf Residential press R or r \n If Agricultural press A or a \n if Commercial press C or c \n");
            char ca;
            ca=sc.next().charAt(0);
		System.out.printf("Enter The total used unit of a customer \n");
		x=sc.nextFloat();
				char y1;
				
			//	y1=sc.next().charAt(0);
			
				
				electricity[c].set_info(c,name,d,ca,x,father,addres);
				
				electricity[c].calculate_bill();
			}
			
			for(c=1;c<=b;c++)
			{
				System.out.printf("Prepared bill for Customer number %d \n",c);
				electricity[c].display_bill();
			}
			
			
		}
		
		else if(a.charAt(0)=='w'||a.charAt(0)=='W')
		{
			
			System.out.printf("Enter the total number of customer\n");
			b=sc.nextInt();
			wifi net[]=new wifi[20];
			for(c=1;c<=10;c++)
			{
				net[c]=new wifi("raju ahmed", c, 1824, "feni", "Nur", 'r');
			}
			
			
			for(c=1;c<=b;c++)
			{
				System.out.printf("Enter the informatin for %d customer\n",c);
			
				System.out.printf("Enter Customer Name\n");
				
				char ch =sc.next().charAt(0);
				name=sc.nextLine();
		
				System.out.print("Enter Customer,s Mobile Number\n");
				d=sc.nextInt();
				
			
				
				
				char q,w;
				
				
				String father,addres;
				System.out.printf("Enter the Customer Father Name ::\n");
				w=sc.next().charAt(0);
				
				father=sc.nextLine();
				System.out.printf("Enter Customer Address :: \n");
				addres=sc.nextLine();
	System.out.printf("Enter the customer Wifi category\nIf 2 Mbps press 2  \n If 4Mbps press 4 \n if 5 Mbps press 5 \n");
				
				char y;
				
				y=sc.next().charAt(0);
			
				
				net[c].set_info(c,name,d,y,father,addres);
				
				net[c].calculate_bill();
			}
			
			for(c=1;c<=b;c++)
			{
				System.out.printf("Prepared bill for Customer number %d \n",c);
				net[c].display_bill();
			}
			
			
		}
		
		
   
	}

}  
