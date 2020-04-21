package com.lcf.gmall.service;

import java.util.List;

import com.lcf.gmall.bean.UserAddress;


/**
 * 用户服务
 * @author lfy
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param 
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
    public static void main(String[] args) {
		System.out.println("host");
	}
}
