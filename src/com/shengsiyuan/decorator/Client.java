package com.shengsiyuan.decorator;

import com.shengsiyuan.decoratortest.Component;
import com.shengsiyuan.decoratortest.ConcreteComponent;
import com.shengsiyuan.decoratortest.ConcreteDecorator1;
import com.shengsiyuan.decoratortest.ConcreteDecorator2;

/**
 * ��1�� װ�ζ������ʵ��������ͬ�Ľӿڡ������ͻ��˶�������Ժ���ʵ������ͬ�ķ�ʽ��װ�ζ��󽻻���
��2�� װ�ζ������һ����ʵ��������ã�reference��
��3�� װ�ζ�������������Կͻ��˵�����������Щ����ת������ʵ�Ķ���
��4�� װ�ζ��������ת����Щ������ǰ���Ժ�����һЩ���ӹ��ܡ�������ȷ����������ʱ��
	�����޸ĸ�������Ľṹ�Ϳ������ⲿ���Ӹ��ӵĹ��ܡ���������������У�ͨ����ͨ���̳���ʵ�ֶԸ�����Ĺ�����չ��
	
	Ҫʵ�ֹ���A,��Ҫ��ʵ�ָù���ǰ��ʵ�ֹ���B��C:
	�ȴ�װ��ʵ����1��ʼ,��1��ʵ��ĳЩ����,�ٽ�ʵ��Ŀ�깦��Aת��������,��(�ؼ���,�ص�)����ָ��װ��ʵ����2,��2��ʵ��ĳЩ����,��
	ת��������,����ָ��Ŀ����,ʵ�ֹ���A
	
	�ؼ��ص�:ת��������,����ָ����һ����:��������super()�ķ���������(��һ����)��������,�����ָ������һ����,�Դ�����
	Component component=new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
 * @author lenovo
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		
	/*	//�ڵ��� 
		Component component = new ConcreteComponent();
		 
		//������ 
		Component component2 = new ConcreteDecorator1(component);
		
		component2.doSomething();
		 
		System.out.println("------------");
		 
		//������ 
		Component component3 = new ConcreteDecorator2(component2);
		 
		component3.doSomething();*/
		 

		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));

		component.doSomething();
	}
}
