package com.shengsiyuan.decorator;

/**
 * ��һҪ��ִ�б�װ�ζ���ķ���,��������������ɸ���ʵ�ֵ�,���Ե��ø���������
 * �ڶ�Ҫ��:�����¹���
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
		System.out.println("����B");
	}
	
	
}
