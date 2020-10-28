package a1;

public class main {
	
	public static void main(String[] args) {
	personal p = new personal();
	CGPA c = new CGPA();
	exam e = new exam();
	
	constructore s = new constructore();
	
	//Mult m = new Mult();
	//findlargel f = new findlargel();
	System.out.println("test is " + p.name);
	p.printName();
	
	System.out.println("cgpa is " + c.result);
	c.printcgpa();
	
	System.out.println("STIA grade is " + e.grade);
	e.printgrade();
	
	c.printgpa();
	
	System.out.println("final cgpa is "+c.calccgpa());
	
	s.constructore1();
	
	
	}
}