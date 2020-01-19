package daily_practice;

public class Hashcode_equals {

	private String ename;
	private int eid;

	public Hashcode_equals(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public int hashCode() {
		return eid;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}if(this==obj) {
			return true;
		}if(this.getClass()!=obj.getClass()) {
			return false;
		}
		Hashcode_equals he=(Hashcode_equals)obj;
		if(this.eid!=he.eid) {
			return false;
		}if(this.ename==null) {
			if(he.ename!=null) {
			return false;
			}
		}else if(!this.ename.equals(he.ename)) {
			return false;
		}
		return true;
	}
}
