package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<5; i++){
			GradeVO gvo = new GradeVO();
			
			System.out.print(i+1);
			System.out.print("번 학생 학번 >>");
			gvo.setStrNum(scanner.nextLine());
			
			System.out.print("국어 >>");
			String strKor = scanner.nextLine();
			int intKor = Integer.valueOf(strKor);
			gvo.setIntKor(intKor);
			
			System.out.print("영어>> ");
			gvo.setIntEng(Integer.valueOf(scanner.nextLine()));
			
			System.out.print("수학>> ");
			gvo.setIntMath(Integer.valueOf(scanner.nextLine()));
			
			int intSum = gvo.getIntEng();
			intSum += gvo.getIntMath();
			intSum += gvo.getIntKor();
			gvo.setIntSum(intSum);
			System.out.println("총점 >> " + intSum);
					
			Float floatAvg = intSum/3.0f;
			gvo.setFloatAvg(floatAvg);
			System.out.println("평균>> " + floatAvg);
			
			gradeList.add(gvo);
		}
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		
		int intListSize = gradeList.size();
		for(int i = 0; i<gradeList.size(); i++) {
			System.out.print(gradeList.get(i).getStrNum()+ "\t");
			System.out.print(gradeList.get(i).getIntKor()+ "\t");
			System.out.print(gradeList.get(i).getIntEng()+ "\t");
			System.out.print(gradeList.get(i).getIntMath()+ "\t");
			System.out.print(gradeList.get(i).getIntSum()+ "\t");
			System.out.print(gradeList.get(i).getFloatAvg()+ "\n");
		}
		
	}

}
