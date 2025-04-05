package com.upskill.java2;

public class IfElseStatement {

	public static void main(String[] args) {
		int age=85;
		if(age<=13){
			System.out.println("children");
		}else if(age>13 && age<=18){
			System.out.println("Teen");
		}else if(age>18 && age<=40){
			System.out.println("adult");
		}else if(age>60){
			if(age>=60 && age<80 ){
				System.out.println("champion");
			}else{
				System.out.println("senior");
			};
		}else{
			System.out.println("old");
		}

	}

}
