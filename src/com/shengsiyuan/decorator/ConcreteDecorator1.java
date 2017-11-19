package com.shengsiyuan.decorator;

/**
 * 第一要务执行被装饰对象的方法,但是这个功能是由父类实现的,所以调用父类来处理
 * 第二要务:增加新功能
 * @author lenovo
 *
 */
public class ConcreteDecorator1 extends Decorator
{
	public ConcreteDecorator1(Component component)
	{
		super(component);
	}
	
	@Override
	public void doSomething()
	{
		super.doSomething();
		
		this.doAnotherThing();
	}
	
	private void doAnotherThing()
	{
		System.out.println("功能B");
	}
	
	
}
