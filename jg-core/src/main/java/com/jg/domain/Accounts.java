package com.jg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jg.constant.YesNo;

@Entity
public class Accounts {

	private long id;
	private int balance;
	private int hitbalance;
	private int total;
	private YesNo block;
	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(length = 12, nullable = false)
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Column(length = 12, nullable = false)
	public int getHitbalance() {
		return hitbalance;
	}
	public void setHitbalance(int hitbalance) {
		this.hitbalance = hitbalance;
	}
	@Column(length = 12, nullable = false)
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getBlock() {
		return block;
	}
	public void setBlock(YesNo block) {
		this.block = block;
	}
	
	
}
