package com.app.modelo;

public class AddressContact extends Base{
	private int codeperson;
	private String addressPrincipal;
	private String numberAddress;
	private String addressInter;
	private String addressRef;
	private String addressType;
	private String addressCity;
	public int getCodeperson() {
		return codeperson;
	}
	public void setCodeperson(int codeperson) {
		this.codeperson = codeperson;
	}
	public String getAddressPrincipal() {
		return addressPrincipal;
	}
	public void setAddressPrincipal(String addressPrincipal) {
		this.addressPrincipal = addressPrincipal;
	}
	public String getNumberAddress() {
		return numberAddress;
	}
	public void setNumberAddress(String numberAddress) {
		this.numberAddress = numberAddress;
	}
	public String getAddressInter() {
		return addressInter;
	}
	public void setAddressInter(String addressInter) {
		this.addressInter = addressInter;
	}
	public String getAddressRef() {
		return addressRef;
	}
	public void setAddressRef(String addressRef) {
		this.addressRef = addressRef;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	@Override
	public String toString() {
		return "AddressContact [codeperson=" + codeperson + ", addressPrincipal=" + addressPrincipal
				+ ", numberAddress=" + numberAddress + ", addressInter=" + addressInter + ", addressRef=" + addressRef
				+ ", addressType=" + addressType + ", addressCity=" + addressCity + "]";
	}
	 

}
