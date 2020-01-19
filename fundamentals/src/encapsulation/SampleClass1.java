package encapsulation;

public class SampleClass1 {
	
	private int empId;
	private String empName;
	
	private int empMarks=10;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public int getEmpMarks() {
		return empMarks;
	}
	
	public void setEmpMarks(int empMarks) {
		if(empMarks > 500)
			this.empMarks=empMarks;
	}

}
