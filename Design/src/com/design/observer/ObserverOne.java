package com.design.observer;

/**
 * author:admin
 * 实现观察者接口，并实现update，目标状态变化是，observer做出相应变化。
 * */
public class ObserverOne implements Observer {
	private String ownStatus;
	
	public String getOwnStatus() {
		return ownStatus;
	}

	public void setOwnStatus(String ownStatus) {
		this.ownStatus = ownStatus;
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof InstenceSubject) {
			InstenceSubject in=(InstenceSubject)subject;
			in.setContent(in.getContent());
			System.out.println(in.getContent()+" 今天天气好，我们出去玩");
			ownStatus=subject.getSubjectStatus();
		}
		
	}

}
