package com.jg.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jg.constant.BetType;
import com.jg.constant.Hitstatus;
import com.jg.constant.Order_Status;
import com.jg.constant.Refundstatus;

@Entity
public class BetOrder {

	private long id;
	private long userId;
	private long gameId;
	private long planId;
	private String issue;
	private String code;
	private Hitstatus hitstatus;
	private Refundstatus refundstatus;
	private int betmoney;
	private int hitmoney;
	private Order_Status status;
	private Date createtime;
	private Date endtime;
	private int zs;
	private int bs;
	private BetType type;

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

	@Column(length = 16, nullable = false)
	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	@Column(length = 16, nullable = false)
	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	@Column(length = 16, nullable = false)
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	@Lob
	@Column(nullable = false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Hitstatus getHitstatus() {
		return hitstatus;
	}

	public void setHitstatus(Hitstatus hitstatus) {
		this.hitstatus = hitstatus;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Refundstatus getRefundstatus() {
		return refundstatus;
	}

	public void setRefundstatus(Refundstatus refundstatus) {
		this.refundstatus = refundstatus;
	}

	@Column(length = 12, nullable = false)
	public int getBetmoney() {
		return betmoney;
	}

	public void setBetmoney(int betmoney) {
		this.betmoney = betmoney;
	}

	@Column(length = 12, nullable = false)
	public int getHitmoney() {
		return hitmoney;
	}

	public void setHitmoney(int hitmoney) {
		this.hitmoney = hitmoney;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 2, nullable = false)
	public Order_Status getStatus() {
		return status;
	}

	public void setStatus(Order_Status status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(length = 6, nullable = false)
	public int getZs() {
		return zs;
	}

	public void setZs(int zs) {
		this.zs = zs;
	}

	@Column(length = 6, nullable = false)
	public int getBs() {
		return bs;
	}

	public void setBs(int bs) {
		this.bs = bs;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public BetType getType() {
		return type;
	}

	public void setType(BetType type) {
		this.type = type;
	}

}
