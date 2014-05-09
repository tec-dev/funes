package model.objects;

public class Address {
	private String street;
	private String district;
	private String canton;
	private int province;

	/* Constructor */
	public Address(String address, String district, String canton, int province) {
		this.street = address;
		this.district = district;
		this.canton = canton;
		this.province = province;
	}

	public String getStreet() {
		return street;
	}

	public void setAddress(String address) {
		this.street = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	
	public boolean equals(Object object) {
		Address address = (Address) object;
		return address.getStreet().equals(street) 
		&& address.getCanton().equals(canton) &&
		address.getDistrict().equals(district)&&
		address.getProvince() == province;
		
	}
}
