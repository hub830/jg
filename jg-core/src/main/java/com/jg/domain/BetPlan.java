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

import com.jg.constant.PayStatus;
import com.jg.constant.Plan_Status;
import com.jg.constant.BetType;
import com.jg.constant.YesNo;

@Entity
public class BetPlan {

	private long id;
	private long userId;
	private long gameId;
	private String beginIssue;
	private String chaseIssue;
	private String completeIssue;
	private int betmoney;
	private int hitmoney;
	private int zs;
	private String code;
	private String plan;
	private Date createtime;
	private YesNo hitend;
	private PayStatus pay;
	private BetType type;
	private Plan_Status status;

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
	public String getBeginIssue() {
		return beginIssue;
	}

	public void setBeginIssue(String beginIssue) {
		this.beginIssue = beginIssue;
	}

	@Column(length = 6, nullable = false)
	public String getChaseIssue() {
		return chaseIssue;
	}

	public void setChaseIssue(String chaseIssue) {
		this.chaseIssue = chaseIssue;
	}

	@Column(length = 6, nullable = false)
	public String getCompleteIssue() {
		return completeIssue;
	}

	public void setCompleteIssue(String completeIssue) {
		this.completeIssue = completeIssue;
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

	@Column(length = 6, nullable = false)
	public int getZs() {
		return zs;
	}

	public void setZs(int zs) {
		this.zs = zs;
	}

	@Lob
	@Column(nullable = false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Lob
	@Column(nullable = false)
	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getHitend() {
		return hitend;
	}

	public void setHitend(YesNo hitend) {
		this.hitend = hitend;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public PayStatus getPay() {
		return pay;
	}

	public void setPay(PayStatus pay) {
		this.pay = pay;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public BetType getType() {
		return type;
	}

	public void setType(BetType type) {
		this.type = type;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Plan_Status getStatus() {
		return status;
	}

	public void setStatus(Plan_Status status) {
		this.status = status;
	}

}
