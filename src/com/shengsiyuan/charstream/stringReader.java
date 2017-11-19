package com.shengsiyuan.charstream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

public class stringReader {
	public static void main(String[] args) {
		// 3. 从内存中读入
		String s2="df你好13asdf你好13asdf你好13asdf你";
	    StringReader in2 = new StringReader(s2);
	    int c;//StringReader 读取单个字符，使用int类型（查看文档）
	    try {
			while((c = in2.read()) != -1)
			  System.out.print((char)c);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
