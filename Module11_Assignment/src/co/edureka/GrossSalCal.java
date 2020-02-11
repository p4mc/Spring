package co.edureka;

public class GrossSalCal {
	
	double gSal;
	double tax = 0.15;
	double netSal;
	
	public double gSalary(int basic, int hra, int da, int deduction) {
		
		gSal = basic + hra + da;
		
		netSal = gSal - (1500 - deduction );
		
		return gSal;
		
	}
	
	

}
