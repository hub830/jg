package com.jg.constant;

/**
 * 交易类型
 * A开头:余额入 
 * B开头:余额出 
 * C开头:奖金入
 * D开头:奖金出
 * @author ez
 *
 */
public enum TradeType {
	/** 充值 */
	A001,
	/** 投注失败退款 */
	A002,
	/** 方案停追退款 */
	A003,
	/** 中奖截止退款 */
	A004,
	/** 奖金转彩币 */
	A005,
	/** 投注  */
	B001,
	/** 返奖  */
	C001,
	/** 提现退款  */
	C002,
	/** 提现  */
	D001;
}
