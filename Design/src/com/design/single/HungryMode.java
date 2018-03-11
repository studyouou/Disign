package com.design.single;

/**
 * author:admin
 * 饿汉模式
 * */
public class HungryMode {
	private HungryMode(){
		
	}
	private static HungryMode hungryMode=new HungryMode();
	
	//加载的时候就实例化对象了
	public static HungryMode getHungryMode() {
		return hungryMode;
	}
}
