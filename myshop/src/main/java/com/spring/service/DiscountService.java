package com.spring.service;

import com.myshop.vo.MyshopMemberVO;

public interface DiscountService {
	/**
	 * ������å �������̽�
	 *
	 * @return ���� ��� �ݾ�
	 */
	int discount(MyshopMemberVO member, int price);
}
