package finaljava;
public class Electricity  extends Bill{

	char category;
	float unit;
	float per_customer_bill;
	
	Electricity(String a, int b, int c, String d, String e,char f, float g) {
		super(a, b, c, d, e);
		this.category=f;
		this.unit=g;
		
		
	}
	
	
	void set_category(char a)
	{
		
		this.category=a;
	}
	char get_category()
	{
		
		
		return category;
	}
	void set_unit(float a)
	{
		this.unit=a;
	}
	int get_unit()
	{
		return (int) unit;
	}
	public void set_info(int a, String b,int c, char d, float e,String f, String g )
	{
		
		super.set_customer_id(a);
		super.set_customer_name(b);
		super.set_customer_number(c);
		super.set_customer_father_name(f);
		super.set_customer_address(g);
		this.set_unit(e);
		this.set_category(d);
		
		
	}
	
	
   	 public void calculate_bill()
   	 {
   		 float b=this.unit;
   		 
   		 char a=this.category;
   		 if(a=='R'||a=='r')
   		 {
   			 
   			 if(b>=1.&&b<=75.)
   			 {
   				 per_customer_bill+=(b*3.50);
   			 }
   			 else if(b>=76.&&b<=200.)
   			 {
   				 per_customer_bill+=(b*5.45);
   			 }
   			else if(b>=201.&&b<=300.)
  			 {
  				 per_customer_bill+=(b*5.70);
  			 }
   			else if(b>=301.&&b<=400.)
  			 {
  				 per_customer_bill+=(b*6.02);
  			 }
   			else if(b>=401.&&b<=600.)
  			 {
  				 per_customer_bill+=(b*9.30);
  			 }
   			else 
  			 {
  				 per_customer_bill+=(b*10.70);
  			 }
   		 }
   		 
   		 else if(a=='a'||a=='A')
   		 {
   			 per_customer_bill+=(b*4.00);
   		 }
   		 else if(a=='c'||a=='C')
   		 {
   			 per_customer_bill+=(b*12.36);
   		 }
   		 
   		
   	 }
   	 public void display_bill()
   	 {
   		 System.out.printf("\n\n\n");
   		 System.out.printf("Customer id              :: %d\n",super.get_customer_id());
   		  System.out.printf("Customer Name           :: %s\n",get_customer_name());
   		  System.out.printf("Customers Father name   :: %s \n", super.get_customer_father_name());
   		  System.out.printf("Customer Address        :: %s\n", super.get_customer_address());
   		  if(this.category=='R'||this.category=='r')
   		  {
   		System.out.printf("Meter Category            :: Residential\n");
   		  }
   		 if(this.category=='c'||this.category=='C')
  		  {
  		System.out.printf("Meter Category            :: Commercial\n");
  		  }
   		 if(this.category=='a'||this.category=='A')
  		  {
  		 System.out.printf("Meter Category           :: Agriculture\n");
  		  }
  		  System.out.printf("Total Discount          :: 0 Taka\n");
  		  System.out.printf("Monthly Meter Fee       :: 20\n");
   		  System.out.printf("Customer total bill     :: %f\n",per_customer_bill+20);
   		  
   		 
   		 
   	 }

	
	
	
}
