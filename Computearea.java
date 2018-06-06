package demo;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Computearea{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入半径");
		double radius=input.nextDouble(); 
		double area=radius*radius*3.1415926;
		System.out.println("半径为"+radius+"的圆的面积是"+area); 
	}
}

class Computeaverage{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("请输入三个数字");
	double num1=input.nextDouble();
	double num2=input.nextDouble();
	double num3=input.nextDouble();
	double average=(num1+num2+num3)/3;
	System.out.println("这三个数字的平均值是"+average);
	}
}