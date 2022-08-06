// In this code we are getting output as different customer fee data.

package javaPackage;

public class CustomerMethod {
	
	void fee_paid_amount(int fee)
	{
		System.out.println("Pay the fee amount $"+fee);
	}

	public static void main(String[] args) {
	
		// Here we have created a new object to the class as obj. 
		
		CustomerMethod obj =new CustomerMethod();
		
		// we have created a method.
		
		obj.fee_paid_amount(400);
		
		CustomerMethod obj1 =new CustomerMethod();
		obj1.fee_paid_amount(600);
		
		CustomerMethod obj2 =new CustomerMethod();
		obj2.fee_paid_amount(800);
		
		CustomerMethod obj3 =new CustomerMethod();
		obj3.fee_paid_amount(900);

	}

}
