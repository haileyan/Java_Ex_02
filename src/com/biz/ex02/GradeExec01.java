package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 >> ");
		gradeVO.setStrNum(scanner.nextLine());
		
		System.out.print("국어 >> ");
		gradeVO.setIntKor(Integer.valueOf(scanner.nextLine()));
		// String strKor = scanner.nextLine();
		// int intKor = Integer.valueOf(strKor);
		// gradeVO.setIntKor(intKor);
		
		System.out.print("영어 >> ");
		gradeVO.setIntEng(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("수학 >> ");
		gradeVO.setIntMath(Integer.valueOf(scanner.nextLine()));
		
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng(); 
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);
		System.out.println("총점 >> " + intSum);

		float floatAvg = intSum/3.0f;
		floatAvg = (float) intSum / 3;
		gradeVO.setFloatAvg(floatAvg);
		System.out.println("평균 >>" + floatAvg);
		
	}

}
