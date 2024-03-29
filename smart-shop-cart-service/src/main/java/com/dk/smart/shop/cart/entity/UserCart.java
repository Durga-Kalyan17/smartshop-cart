package com.dk.smart.shop.cart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "user_cart")
public class UserCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "product_id")
	@JsonProperty("product_id")
	private Long productId;
	
	@Column(name = "product_name")
	@JsonProperty("product_name")
	private String productName;
	
	@Column(name = "in_cart")
	@JsonProperty("in_cart")
	private boolean inCart;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isInCart() {
		return inCart;
	}

	public void setInCart(boolean inCart) {
		this.inCart = inCart;
	}
	
	
	public UserCart() {
		
	}
	
	public UserCart(Long productId, String productName, boolean inCart) {
		this.productId = productId;
		this.productName = productName;
		this.inCart = inCart;
	}
	
	
	@Override
	public String toString() {
		return "UserCart [id=" + id + ", productId=" + productId + ", productName=" + productName + ", inCart=" + inCart
				+ "]";
	}

}
