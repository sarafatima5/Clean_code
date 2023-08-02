package project;

class User{
	public void getName(String s) {
	System.out.println("user:"+s);
	}
}

class Book{
	public void getBookName(String s) {
		System.out.println("Book:"+s);
	}
}

class Order{
	public void getOrderNumber(int n) {
		System.out.println("Order:"+n);
	}
}

class Payment{
	public void getPayment(int n) {
		System.out.println("Payment:"+n);
	}
}

public class project1 {
	public static void main(String[] args) {
		User obj=new User();
		obj.getName("Xyz");
		
		Book obj1=new Book();
		obj1.getBookName("Clean Code");
		
		Order obj2=new Order();
		obj2.getOrderNumber(5);
		
		Payment obj3=new Payment();
		obj3.getPayment(600);
		
	}
}
