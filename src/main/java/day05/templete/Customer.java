package day05.templete;

public class Customer extends Company 
{
	private int size;	// Number of employees

	public Customer(String name, String address, String phone, String fax,
			int size)		
	{
		super(name, address, phone, fax);
		this.size = size;
	}

	public void setSize(int size) { this.size = size; }
	public int getSize() { return size; }
	
	// Replacement Method
	@Override
	public String getType() { return "Customer"; }

	// Extension Method
	@Override
	public void showPersonalData()
	{
		System.out.println("         Size: " + size);
		System.out.println();
	}
}
