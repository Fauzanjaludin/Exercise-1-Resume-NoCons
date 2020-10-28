package a1;



public class constructore{

	int age;
	String name,dob;
	
	constructore(){
		this.age=0;
		this.name="null";
		this.dob="01010101";
	}
	
	constructore(int a,String n,String d){
		this.age=a;
		this.name=n;
		this.dob=d;
		
	}
	
	public void constructore1() {
		constructore obj1= new constructore(70,"grand","20th april 1969");
		constructore obj2= new constructore(22,"me","3rd june 2076");
		constructore obj3= new constructore();
		constructore obj4= new constructore(369,"mum","1st january 0001");
		
		System.out.println("that is "+obj1.name+" their age is "+obj1.age+" born on "+obj1.dob);
		System.out.println("that is "+obj2.name+" their age is "+obj2.age+" born on "+obj2.dob);
		System.out.println("that is "+obj3.name+" their age is "+obj3.age+" born on "+obj3.dob);
		System.out.println("that is "+obj4.name+" their age is "+obj4.age+" born on "+obj4.dob);
		
		
		
		
		
	}
}
