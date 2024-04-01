

public class Customer {
	
	private int cid;
	private String cname;
	private String caddress;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Customer(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", caddress=" + caddress;
	}
	public Customer() {
		super();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("call finalize");
		super.finalize();
	}
}
