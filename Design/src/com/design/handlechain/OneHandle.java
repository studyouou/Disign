package com.design.handlechain;

public class OneHandle extends PriceHandle {

	@Override
	public void handle(float price) {
		if (price<0.05) {
			System.out.println("OneHandle处理的请求");
		}else {
			priceHandle.handle(price);
		}
	}

}
