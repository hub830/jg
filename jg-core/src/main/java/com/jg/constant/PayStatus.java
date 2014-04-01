package com.jg.constant;

public enum PayStatus {
	/** 等待支付 */
	WAIT,
	/** 己支付 */
	SUCCESS,
	/** 取消(己过期) */
	CANCEL;
}
