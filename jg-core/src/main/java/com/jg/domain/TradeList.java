package com.jg.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jg.constant.TradeType;

@Entity
public class TradeList {

	private long id;

	private long userId;
	private int balance;
	private int hitbalance;
	private int inmoney;
	private int outmoney;
	private TradeType type;
	private String description;
	private long associateId;
	private Date createtime;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 16, nullable = false)
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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
	public int getInmoney() {
		return inmoney;
	}

	public void setInmoney(int inmoney) {
		this.inmoney = inmoney;
	}

	@Column(length = 12, nullable = false)
	public int getOutmoney() {
		return outmoney;
	}

	public void setOutmoney(int outmoney) {
		this.outmoney = outmoney;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 8, nullable = false)
	public TradeType getType() {
		return type;
	}

	public void setType(TradeType type) {
		this.type = type;
	}

	@Column(length = 256)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(length = 16, nullable = false)
	public long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(long associateId) {
		this.associateId = associateId;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
