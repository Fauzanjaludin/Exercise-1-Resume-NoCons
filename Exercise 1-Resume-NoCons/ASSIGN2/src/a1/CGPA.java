package a1;

public class CGPA {
	String result="3.4";
	double[] gpa={3.4,3.2,3.3,3.4};
	double sum=0;
	double finalcgpa=0;
	
	
public void printcgpa() {
	System.out.println("cgpa is "+result);	
}

public void printgpa() {
	
	for(int i=0; i<gpa.length;i++) {
		System.out.println("GPA for sem "+ (i+1) + " is " + gpa[i]);
		
		
	}
	
}
public double calccgpa() {
	
	for(int i=0; i<gpa.length;i++) {
		sum+=gpa[i];
		
	}
	finalcgpa = sum/gpa.length;
	return finalcgpa;
}

}
