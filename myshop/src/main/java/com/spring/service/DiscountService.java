package com.spring.service;

import com.myshop.vo.MyshopMemberVO;

public interface DiscountService {
	/**
	 * 할인정책 인터페이스
	 *
	 * @return 할인 대상 금액
	 */
	int discount(MyshopMemberVO member, int price);
}
