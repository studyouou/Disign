package com.design.handlechain;

public abstract class PriceHandle {
	protected PriceHandle priceHandle;
	
	public void setPriceHandle(PriceHandle priceHandle) {
		this.priceHandle = priceHandle;
	}
	
	public abstract void handle(float zekou);
}
