package com.zbv.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			//手机号码
//			System.out.println("请输入一个字符串！");
//	        Scanner scan=new Scanner(System.in);
//	        String str=scan.next();
//	        System.out.println(str);
//			if(str.matches("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$")){
//				System.out.println("bingo...");
//			}else{
//				System.out.println("error...");
//			}
			//邮箱
//			System.out.println("请输入邮箱！");
//			Scanner input=new Scanner(System.in);
//			String content=input.next();
//			System.out.println(content);
//			Pattern p=Pattern.compile("^([a-zA-Z0-9]+[-\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z0-9A-Z]{2,}$");
//			Matcher m=p.matcher(content);
//			if(m.matches()){
//				System.out.println("bingo...");
//			}else{
//				System.out.println("error...");
//			}
			//密码 首字母必须字母开头
			System.out.println("请输入密码！");
			Scanner input=new Scanner(System.in);
			String content=input.next();
			System.out.println(content);
//			if(content.matches("^[a-zA-Z]{1}\\w{5,11}$"))
			if(content.matches("^[a-zA-Z]{1}[-\\w]{5,11}$")){
				System.out.println("bingo...");
			}else{
				System.out.println("error...");
			}
		}
		
	}

}
