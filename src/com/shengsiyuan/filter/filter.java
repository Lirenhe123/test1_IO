package com.shengsiyuan.filter;

import java.io.File;
import java.io.FilenameFilter;

public class filter {
	public static void main(String[] args) {
		File file=new File(".");
		fileNameFilter filter=new fileNameFilter(".txt");
		String filenames[]=file.list(filter);
		for(String filename:filenames){
			System.out.println(filename);
		}
	}
}
class fileNameFilter implements FilenameFilter{
	String type;
	
	fileNameFilter(String type){
		this.type=type;
	}
	
	@Override
	/**
	 * dir - ���ҵ����ļ����ڵ�Ŀ¼��name - �ļ������ơ�
	 * :�ص��ڴ�:dir��name���Զ����뵽filter�е�
	 * �ο�˵��:
	 * ���ҽ����ڴ˳���·���������ʾ��Ŀ¼�е��ļ�����Ŀ¼���ϵ��ù�������
	 * FilenameFilter.accept(java.io.File, java.lang.String) 
	 * �������� true ʱ�������Ʋ������������ 
	 */
	
	public boolean accept(File file,String name){
		return name.endsWith(type);
	}
}