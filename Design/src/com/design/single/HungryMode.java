package com.design.single;

/**
 * author:admin
 * ����ģʽ
 * */
public class HungryMode {
	private HungryMode(){
		
	}
	private static HungryMode hungryMode=new HungryMode();
	
	//���ص�ʱ���ʵ����������
	public static HungryMode getHungryMode() {
		return hungryMode;
	}
}
