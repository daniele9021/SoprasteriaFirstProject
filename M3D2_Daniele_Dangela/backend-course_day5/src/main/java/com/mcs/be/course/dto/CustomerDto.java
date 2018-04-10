package com.mcs.be.course.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String cartId;
    
    public CustomerDto() {}
    
    
	public CustomerDto(Long id, String firstName, String lastName, String password, String cartId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password=password;
		this.cartId = cartId;
	}

	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCartId() {
		return cartId;
	}


	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", cartId=" + cartId + "]";
	}

	
	
    

}
