package com.design.handlechain;

public class ThreeHandle extends PriceHandle{

	@Override
	public void handle(float zekou) {
		if (zekou<0.3) {
			System.out.println(this.getClass().getName()+":����������");
		}else {
			System.out.println("��������");
		}
	}

}
