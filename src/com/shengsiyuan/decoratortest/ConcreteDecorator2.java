package com.shengsiyuan.decoratortest;

public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	public void doSomething(){
		this.doOtherthing();
		super.doSomething();
//		this.doOtherthing();
	}
	public void doOtherthing(){
		System.out.println("实现功能C");
	}

}
