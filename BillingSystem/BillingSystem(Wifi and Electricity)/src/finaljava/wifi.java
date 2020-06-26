package finaljava;
public class wifi  extends Bill{

	char category;
	float unit;
	float per_customer_bill;
	
	wifi(String a, int b, int c, String d, String e,char f) {
		super(a, b, c, d, e);
		this.category=f;
		
		
	}
	
	
	void set_category(char a)
	{
		
		this.category=a;
	}
	char get_category()
	{
		
		
		return category;
	}
	
	public void set_info(int a, String b,int c, char d, String f, String g )
	{
		
		super.set_customer_id(a);
		super.set_customer_name(b);
		super.set_customer_number(c);
		super.set_customer_father_name(f);
		super.set_customer_address(g);
		
		this.set_category(d);
		
		
	}
	
	
   	 public void calculate_bill()
   	 {
   		
   		 
   		 char a=this.category;
   		 if(a=='2')
   		 {
   			 per_customer_bill+=500;
   		 }
   		 
   		 else if(a=='4')
   		 {
   			 per_customer_bill+=800;
   		 }
   		 else if(a=='5')
   		 {
   			 per_customer_bill+=1000;
   		 }
   		 
   		
   	 }
   	 public void display_bill()
   	 {
   		 System.out.printf("\n\n\n");
   		 System.out.printf("Customer id              :: %d \n",super.get_customer_id());
   		  System.out.printf("Customer Name           :: %s\n",get_customer_name());
   		  System.out.printf("Customers Father name   :: %s \n", super.get_customer_father_name());
   		  System.out.printf("Customer Address        :: %s\n", super.get_customer_address());
   		  if(this.category=='4')
   		  {
   			  System.out.printf("Meter Category      :: 4 Mb/s \n");
   		  }
   		  else if(this.category=='5')
   		  {
   			 System.out.printf("Meter Category        :: 5 Mb/s \n"); 
   		  }
   		 else if(this.category=='2')
  		  {
  			 System.out.printf("Meter Category 2 Mb/s   :: 2 Mb/s \n"); 
  		  }
   		  
   		  System.out.printf("Customer total bill     :: %f\n",per_customer_bill);
   		  
   		 
   		 
   	 }

	
	
	
}