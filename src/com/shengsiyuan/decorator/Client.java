package com.shengsiyuan.decorator;

import com.shengsiyuan.decoratortest.Component;
import com.shengsiyuan.decoratortest.ConcreteComponent;
import com.shengsiyuan.decoratortest.ConcreteDecorator1;
import com.shengsiyuan.decoratortest.ConcreteDecorator2;

/**
 * （1） 装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方式和装饰对象交互。
（2） 装饰对象包含一个真实对象的引用（reference）
（3） 装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象。
（4） 装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，
	不用修改给定对象的结构就可以在外部增加附加的功能。在面向对象的设计中，通常是通过继承来实现对给定类的功能扩展。
	
	要实现功能A,但要在实现该功能前后实现功能B和C:
	先从装饰实现类1开始,在1中实现某些功能,再将实现目标功能A转发给父类,而(关键点,重点)父类指向装饰实现类2,在2中实现某些功能,再
	转发给父类,父类指向目标类,实现功能A
	
	关键重点:转发给父类,父类指向下一个类:本类利用super()的方法将参数(下一个类)交给父类,父类就指向了下一个类,以此类推
	Component component=new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
 * @author lenovo
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		
	/*	//节点流 
		Component component = new ConcreteComponent();
		 
		//过滤流 
		Component component2 = new ConcreteDecorator1(component);
		
		component2.doSomething();
		 
		System.out.println("------------");
		 
		//过滤流 
		Component component3 = new ConcreteDecorator2(component2);
		 
		component3.doSomething();*/
		 

		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));

		component.doSomething();
	}
}
