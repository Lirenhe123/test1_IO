package com.shengsiyuan.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipedStream {
	private static PipedInputStream pipedIS=new PipedInputStream();
	private static PipedOutputStream pipedOS=new PipedOutputStream();
	private static InputStream is=null;
			
	public static void main(String[] args) {
		try {
			pipedIS.connect(pipedOS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WriterThread();
		
		byte[] inArray1=new byte[1024];
		byte[] inArray2=new byte[1024];
		byte[] inArrayAll=null;
		int bytesRead=0;
		try {
			bytesRead=pipedIS.read(inArray1,0,1024);
			bytesRead = pipedIS.read(inArray2, 0, 1024);
			
			inArrayAll=new byte[inArray1.length+inArray2.length];
			System.arraycopy(inArray1, 0, inArrayAll, 0, inArray1.length);
			System.arraycopy(inArray2, 0, inArrayAll, inArray1.length, inArray2.length);
			
			String str=new String(inArrayAll);
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] inputStream(){
		File file=new File("test.txt");
		byte[] buffer=new byte[2048];
		int len=0;
		try {
			
			is=new FileInputStream(file);
			while((len=is.read(buffer))!=-1){
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return buffer;
		
	}
	
	public static void WriterThread(){
		
		Runnable thread=new Runnable(){
			public void run(){
				byte[] outArray=null;
				outArray=inputStream();
				while(true){
					try {
						pipedOS.write(outArray,0,outArray.length);
					} catch (IOException e) {
						e.printStackTrace();
						System.err.println("写操作错误");
						System.exit(1);
					}
				}
			}
		};
		Thread writeThread=new Thread(thread);
		writeThread.start();
	}

}
