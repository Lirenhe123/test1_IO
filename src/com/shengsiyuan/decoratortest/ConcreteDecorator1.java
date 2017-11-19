package com.shengsiyuan.decoratortest;

public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	public void doSomething(){
		this.doOtherthing();
		super.doSomething();
//		this.doOtherthing();
	}
	public void doOtherthing(){
		System.out.println("实现功能B");
	}
}
