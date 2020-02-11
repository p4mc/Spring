package co.edureka;

public class Employee {
	private int empno;
	private String ename;
	private int basic, hra, da, deduction;

	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empno, String ename, int basic, int hra, int da, int deduction) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.deduction = deduction;

	}


	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getDeduction() {
		return deduction;
	}
	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename +", basic=" + basic + ", hra=" + hra + ", da=" + da + ", deduction="
				+ deduction + "]";
	}
	
	

}
