package com.shengsiyuan.filter;

import java.io.File;
import java.io.FileFilter;

public class filterFile {
	public static void main(String[] args) {
		File file=new File("C:/Users/lenovo/Desktop/file");
		FileFilter filefilter=new fileFilter(".java");
		File[] files=file.listFiles(filefilter);
		for(File f:files){
			System.out.println(f.getName());
		}
	}
}

class fileFilter implements FileFilter{
	String type;
	public fileFilter(String type){
		this.type=type;
	}
	public boolean accept(File f) {
		boolean flag=f.getName().endsWith(type);
		return flag;
	}
}
