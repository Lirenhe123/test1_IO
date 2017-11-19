package com.shengsiyuan.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class fileInputStream {
	public static void main(String[] args) {
		File file=new File("fileoutputstream");
		InputStream is=null;
		try {
			is=new FileInputStream(file);
			byte[] buffer=new byte[1024];
			int len;
			while((len=(is.read(buffer)))!=-1){
				System.out.println("返回读入字节数:"+len);
				String str=new String(buffer,0,len);//String(buffer):会将整个buffer1024个字节都字符串化打印出来
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件打开失败");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件读入失败");
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
