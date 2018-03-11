package com.design.handlechain;

public class TwoHandle extends PriceHandle {

	@Override
	public void handle(float zekou) {
		if (zekou<0.05) {
			System.out.println(this.getClass().getName()+":���������");
		}else {
			priceHandle.handle(zekou);
		}
	}

}
