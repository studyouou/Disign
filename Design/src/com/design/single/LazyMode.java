package com.design.single;

/**
 * author:admin
 * 懒汉模式
 * */
public class LazyMode {
	/*
	 *私有化构造函数，禁止实例化
	 */
	 
	private LazyMode(){
		
	}
	private static LazyMode lazyMode;
	//使用的时候才实例化对象，还有一个问题就是线程不安全
	public static LazyMode getLazeMode() {
		if (lazyMode==null) {
			lazyMode=new LazyMode();
		}
		return lazyMode;
	}
}
