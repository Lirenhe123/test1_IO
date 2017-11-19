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
	 * dir - 被找到的文件所在的目录。name - 文件的名称。
	 * :重点在此:dir和name是自动传入到filter中的
	 * 参考说明:
	 * 当且仅当在此抽象路径名及其表示的目录中的文件名或目录名上调用过滤器的
	 * FilenameFilter.accept(java.io.File, java.lang.String) 
	 * 方法返回 true 时，该名称才满足过滤器。 
	 */
	
	public boolean accept(File file,String name){
		return name.endsWith(type);
	}
}