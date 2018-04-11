package com.mcs.be.course.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CartEntryDto implements Serializable{

     private Long articleId;
     private int quantity;
     private BigDecimal unitPrice;
     private BigDecimal totalPrice;
     
     

	public CartEntryDto () {}


	public CartEntryDto(Long articleId, int quantity, BigDecimal unitPrice,BigDecimal totalPrice) {
		super();
		
		this.articleId = articleId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
	}

	public Long getArticleId() {
		return articleId;
	}


	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
		
	
}
