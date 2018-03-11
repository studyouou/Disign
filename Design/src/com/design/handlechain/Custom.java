package com.design.handlechain;

import org.omg.CORBA.PrincipalHolder;

public class Custom {
	private PriceHandle priceHandle;
	
	public void setPriceHandle(PriceHandle priceHandle) {
		this.priceHandle = priceHandle;
	}
	
	public void request(float zekou){
		
		priceHandle.handle(zekou);
	}
	
	public static void main(String[] args) {
		Custom custom=new Custom();
		PriceHandle priceHandle=PrinceHandleFactory.getHandle("com.ougen.handle.OneHandle");
		custom.setPriceHandle(priceHandle);
		custom.request(0.6f);
	}
}
