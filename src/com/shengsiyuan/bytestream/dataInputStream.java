package com.shengsiyuan.bytestream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataInputStream {
	public static void main(String[] args) {
		File file=new File("dataoutputstream.txt");
		DataInputStream dis=null;
		try {
			dis=new DataInputStream(new FileInputStream(file));
			
			String name=null;
			float price = 0;
			int num = 0;
			for(int i=0;i<3;i++){
				String str=null;
				if((str=dis.readUTF())!="\t"){
					name=str;
				}
				dis.readUTF();
				price=dis.readFloat();
				dis.readUTF();
				num=dis.readInt();
				dis.readUTF();
				System.out.println("名称："+name+";"+"价格："+price+";"+"数量："+num);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取失败");
			e.printStackTrace();
		}
	}

}
