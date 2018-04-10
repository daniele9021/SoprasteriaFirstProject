package com.mcs.be.course.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CartEntry  implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(nullable = false)
	private Long id;
	
	 @Column(nullable = false)
	 private Long articleId;
	 
	 @Column(nullable = false)
	 private int quantity;
	 
	 @Column(nullable = false)
	 private BigDecimal unitPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
