package com.vw.crud_op.dto;

import javax.persistence.Column;
// Cust ID, Cust Name, location, email & 
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopingCustomer {
	
	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_location")
	private String customerLocation;
	
	@Column(name="customer_email")
	private String customerEmail;
	
	@Column(name="customer_contact_no")
	private String customerContactNo;

	public ShopingCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShopingCustomer(Integer customerId, String customerName, String customerLocation, String customerEmail,
			String customerContactNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.customerEmail = customerEmail;
		this.customerContactNo = customerContactNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	@Override
	public String toString() {
		return "ShopingCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerLocation="
				+ customerLocation + ", customerEmail=" + customerEmail + ", customerContactNo=" + customerContactNo
				+ "]";
	}

}
