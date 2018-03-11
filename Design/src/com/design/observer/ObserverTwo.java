package com.design.observer;

/**
 * author:admin
 * */
public class ObserverTwo implements Observer {
	private String ownStutas;
	@Override
	public void update(Subject subject) {
		if (subject instanceof InstenceSubject) {
			InstenceSubject in=(InstenceSubject)subject;
			in.setContent(in.getContent());
			System.out.println(in.getContent()+" 今天天气好，我们去逛街吧");
			ownStutas=subject.getSubjectStatus();
		}
	}

}
