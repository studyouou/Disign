package com.design.handlechain;

public class ThreeHandle extends PriceHandle{

	@Override
	public void handle(float zekou) {
		if (zekou<0.3) {
			System.out.println(this.getClass().getName()+":处理了请求");
		}else {
			System.out.println("都处理不了");
		}
	}

}
