

public class Product {
	private Integer pid;
	private String pname;
	private Double pprice;
	
	
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPprice() {
		return pprice;
	}
	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}
	public Product(Integer pid, String pname, Double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public Product() {
		super();
	}
	
	


}
