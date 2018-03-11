package com.design.observer;

/**
 * author:admin
 * ʵ�ֹ۲��߽ӿڣ���ʵ��update��Ŀ��״̬�仯�ǣ�observer������Ӧ�仯��
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
			System.out.println(in.getContent()+" ���������ã����ǳ�ȥ��");
			ownStatus=subject.getSubjectStatus();
		}
		
	}

}
