package com.lcf.gmall.service;

import java.util.List;

import com.lcf.gmall.bean.UserAddress;

public interface OrderService {

	
	/*
	 * 根据用户ID初始化订单
	 */
	public List<UserAddress> initOrder(String userId);
}
