package com.shengsiyuan.recursion;

import java.io.File;

public class DeleteFiles {
	public static void main(String[] args) {
		Test test=new Test();
		File file=new File("C:/Users/lenovo/Desktop/file");
		test.deleteFiles(file);
	}
	
}

class Test{
	public void deleteFiles(File file){
		if(file.isFile()){
			file.delete();
		}else if(file.isDirectory()){
			File[] files=file.listFiles();
			for(File f:files){
				deleteFiles(f);
				f.delete();
			}
			file.delete();
		}
	}
}