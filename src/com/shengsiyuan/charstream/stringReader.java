package com.shengsiyuan.charstream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;

public class stringReader {
	public static void main(String[] args) {
		// 3. ���ڴ��ж���
		String s2="df���13asdf���13asdf���13asdf��";
	    StringReader in2 = new StringReader(s2);
	    int c;//StringReader ��ȡ�����ַ���ʹ��int���ͣ��鿴�ĵ���
	    try {
			while((c = in2.read()) != -1)
			  System.out.print((char)c);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
