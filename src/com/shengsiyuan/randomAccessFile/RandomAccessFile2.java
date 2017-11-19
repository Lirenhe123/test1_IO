package com.shengsiyuan.randomAccessFile;

import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccessFile2 {  
    public static void main(String[] args) throws IOException {  
        RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");  
        for (int i = 0; i < 10; i++) {  
            //д���������double����  
            rf.writeDouble(i * 1.414);  
        }  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "rw");  
        //ֱ�ӽ��ļ�ָ���Ƶ���5��double���ݺ���  (double��Java��ռ8���ֽ�)
        rf.seek(5 * 8);  
        //���ǵ�6��double����  
        rf.writeDouble(47.0001);  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "r");  
        for (int i = 0; i < 10; i++) {  
            System.out.println("Value " + i + ": " + rf.readDouble());  
        }  
        rf.close();  
    }  
}   