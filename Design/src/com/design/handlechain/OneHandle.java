package com.design.handlechain;

public class OneHandle extends PriceHandle {

	@Override
	public void handle(float price) {
		if (price<0.05) {
			System.out.println("OneHandle���������");
		}else {
			priceHandle.handle(price);
		}
	}

}
