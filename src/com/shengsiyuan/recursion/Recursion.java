package com.shengsiyuan.recursion;

public class Recursion {
	public static void main(String[] args) {
		int number = 14;
		int value=0;
		
		Test1 test1=new Test1();
		value=test1.recursion(number);
		System.out.println(value);
	}
}

class Test1{
	public int recursion(int num){
		if(num==1){
			return 1;
		}else{
			return num*recursion(num-1);
		}
		
	}
}
