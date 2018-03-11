package com.design.single;

public class Test {

	public static void main(String[] args) {
		HungryMode hungryMode=HungryMode.getHungryMode();
		
		HungryMode hungryMode2=HungryMode.getHungryMode();
		
		LazyMode lazyMode=LazyMode.getLazeMode();
		LazyMode lazyMode2=LazyMode.getLazeMode();
		
		System.out.println("饿汉模式："+(hungryMode==hungryMode2));
		System.out.println("懒汉模式："+(lazyMode==lazyMode2));
	}

}
