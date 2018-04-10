package com.mcs.be.course.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CartEntryDto implements Serializable{

	 private Long cartId;
     private Long articleId;
     private int quantity;
     private BigDecimal unitPrice;
     
     
     //TODO campo "totalPrice" (quantity * unitPrice) (configurare OrikaMapper per farlo)
     
	public CartEntryDto () {}


	public CartEntryDto(Long cartId, Long articleId, int quantity, BigDecimal unitPrice) {
		super();
		this.cartId = cartId;
		this.articleId = articleId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}


	public Long getCartId() {
		return cartId;
	}


	public void setCartId(Long cartId) {
		this.cartId = cartId;
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
	
		
	
}
