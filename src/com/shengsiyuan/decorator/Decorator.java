package com.shengsiyuan.decorator;

/**
 * 这个类:装饰Component的实现类,但并没有增加任何方法,留给之类去增加
 * 该类的唯一功能就是调用执行被装饰类对象的方法
 * @author lenovo
 *
 */
public class Decorator implements Component
{
	private Component component;
	
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	@Override
	public void doSomething()
	{
		component.doSomething();
	}
}



