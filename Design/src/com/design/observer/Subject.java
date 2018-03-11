package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author:admin
 * 定义一个目标类，
 * */
public class Subject {
	private List<Observer> observers;
	private String subjectStatus;
	
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
		
	}

	public String getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
		this.notifyOberser();
	}
	public Subject(){
		observers=new ArrayList<Observer>();
	}
	
	public MyEumn addObserver(Observer observer){
		observers.add(observer);
		return MyEumn.SUCCESS;
	}
	public MyEumn deleteObserver(Observer observer) {
		observers.remove(observer);
		return MyEumn.SUCCESS;
	}
	protected void notifyOberser(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
