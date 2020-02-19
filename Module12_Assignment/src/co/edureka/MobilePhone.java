package co.edureka;

public class MobilePhone {
	
	private int mobid;
	private String manufacturer, mname;
	private float price;
	private String color;
	
	public MobilePhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MobilePhone(int mobid, String manufacturer, String mname, float price, String color) {
		super();
		this.mobid = mobid;
		this.manufacturer = manufacturer;
		this.mname = mname;
		this.price = price;
		this.color = color;
	}

	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "MobilePhone [" + mobid + ", | " + manufacturer + ", | " + mname + ", | "
				+ price + ", | " + color + "]";
	}

}
