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

import com.jg.constant.UserCash_Status;

@Entity
public class UserCash {

	private long id;
	private long userId;
	private int amount;
	private UserCash_Status status;
	/** 填第3方支付公司ID*/
	private String type;
	private Date createtime;
	private String description;
	private String remark;

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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public UserCash_Status getStatus() {
		return status;
	}
	public void setStatus(UserCash_Status status) {
		this.status = status;
	}
	@Column(length = 12, nullable = false)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Column(length = 256, nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(length = 256)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
