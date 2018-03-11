package com.design.single;

/**
 * author:admin
 * ����ģʽ
 * */
public class LazyMode {
	/*
	 *˽�л����캯������ֹʵ����
	 */
	 
	private LazyMode(){
		
	}
	private static LazyMode lazyMode;
	//ʹ�õ�ʱ���ʵ�������󣬻���һ����������̲߳���ȫ
	public static LazyMode getLazeMode() {
		if (lazyMode==null) {
			lazyMode=new LazyMode();
		}
		return lazyMode;
	}
}
