package com.design.observer;

/**
 * author:admin
 * main������
 * �ѹ۲��߼���Ŀ�ꡣ ���Ҹı�Ŀ���״̬��״̬�ı䡣֪ͨ�۲���������Ӧ�ĸı䣬������Ŀ������
 * 
 * */
public class MainDemo {
	public static void main(String[] args) {
		InstenceSubject subject=new InstenceSubject();
		MyEumn myEumn=subject.addObserver(new ObserverOne());
		MyEumn myEumn1=subject.addObserver(new ObserverTwo());
		System.out.println(myEumn.getCode()+":"+myEumn.getMsg());
		System.out.println(myEumn1.getCode()+":"+myEumn1.getMsg());
		
		subject.setContent("��������");
		subject.setSubjectStatus("�����ı�");
		
	}
}
