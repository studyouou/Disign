package com.design.observer;

/**
 * author:admin
 * main测试类
 * 把观察者加入目标。 并且改变目标的状态，状态改变。通知观察者做出相应的改变，并设置目标内容
 * 
 * */
public class MainDemo {
	public static void main(String[] args) {
		InstenceSubject subject=new InstenceSubject();
		MyEumn myEumn=subject.addObserver(new ObserverOne());
		MyEumn myEumn1=subject.addObserver(new ObserverTwo());
		System.out.println(myEumn.getCode()+":"+myEumn.getMsg());
		System.out.println(myEumn1.getCode()+":"+myEumn1.getMsg());
		
		subject.setContent("天气晴朗");
		subject.setSubjectStatus("天气改变");
		
	}
}
