package com.design.handlechain;

import java.util.logging.Handler;

public class PrinceHandleFactory {
	public static PriceHandle getHandle(String clazz){
		PriceHandle oneHandle=new OneHandle();
		PriceHandle twoHandle=new TwoHandle();
		PriceHandle threeHandle=new ThreeHandle();
		
		oneHandle.setPriceHandle(twoHandle);
		twoHandle.setPriceHandle(threeHandle);
		
		return oneHandle;
	}
}
