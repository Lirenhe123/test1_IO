package com.shengsiyuan.decorator;

/**
 * �����:װ��Component��ʵ����,����û�������κη���,����֮��ȥ����
 * �����Ψһ���ܾ��ǵ���ִ�б�װ�������ķ���
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



