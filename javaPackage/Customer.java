// In this code we are getting output as different customer data.

package javaPackage;

public class Customer {
	
	// Here we have defined the variables as customer information.
	
	String name;
	String sex;
	String address;
	int fee;

	public static void main(String[] args) {
		
		// Here we have created a new object to the class as obj. 

		Customer obj = new Customer();
		
		// we have assigned values to the object.
		
		obj.name= "regina";
		obj.sex= "Male";
		obj.address="Virgania";
		obj.fee= 2000;
		
		System.out.println("Name of customer1 "+obj.name);
		System.out.println("Sex of customer1 "+obj.sex);
		System.out.println("Address of customer1 "+obj.address);
		System.out.println("Fee of customer1 "+obj.fee);
		
		Customer obj2 = new Customer();
		obj2.name="Fidelis";
		obj2.sex= "Male";
		obj2.address="Virgania";
		obj2.fee= 4000;
		
		System.out.println("Name of customer2 "+obj2.name);
		System.out.println("Sex of customer2 "+obj2.sex);
		System.out.println("Address of customer2 "+obj2.address);
		System.out.println("Fee of customer2 "+obj2.fee);
		
		Customer obj3= new Customer();
		obj3.name="Laxmi";
		obj3.sex= "Female";
		obj3.address="Virgania";
		obj3.fee= 6000;
		
		System.out.println("Name of customer3 "+obj3.name);
		System.out.println("Sex of customer3 "+obj3.sex);
		System.out.println("Address of customer3 "+obj3.address);
		System.out.println("Fee of customer3 "+obj3.fee);
		
		Customer obj4= new Customer();
		obj4.name="Usman";
		obj4.sex= "Male";
		obj4.address="Virgania";
		obj4.fee= 8000;
		
		System.out.println("Name of customer4 "+obj4.name);
		System.out.println("Sex of customer4 "+obj4.sex);
		System.out.println("Address of customer4 "+obj4.address);
		System.out.println("Fee of customer4 "+obj4.fee);
		
	}

}
