package finaljava;

public class Bill {
	
	String name;
	int id;
	int number;
	String address;
	String customers_father_name;
	
	
	Bill(String a , int b, int c,String d,String e)
	{
		
		this.name=a;
		this.id=b;
		this.number=c;
		this.address=d;
		this.customers_father_name=e;
		
	}

	void set_customer_name(String a)
	{
		
		
		
		this.name=a;
		
	}
public	String get_customer_name()
	{
		
		return name;
	}
	void set_customer_id(int a)
	{
		this.id=a;
	}
public	int get_customer_id()
	{
		return id;
	}
	void set_customer_number(int a)
	{
		this.number=a;
	}
	
	public int get_customer_number()
	{
		return number;
	}
	void set_customer_address(String s)
	{
		this.address=s;
	}
	
public	String get_customer_address()
	{
		return address;
	}
	void set_customer_father_name(String u)
	{
		this.customers_father_name=u;
	}
public	String get_customer_father_name()
	{
		return customers_father_name;
	}

	public void display_bill() {
		
		
	}
	public void set_info(int a , String b , int c, char d,float e)
	{
		
	}

	public void calculate_bill() {
		
		
	}
	
	
}