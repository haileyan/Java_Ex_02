package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec04 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i =0; i<2; i++){
			GradeVO gvo = new GradeVO();
			
			// GradeVO를 gvo로 생성해서 매개변수로 전달
			makeScore(gvo);
			
			// 전달했던 gvo를 gradeList에 추가
			gradeList.add(gvo);
		}
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		
		for(GradeVO vo : gradeList) {
			viewScore(vo);
		}
		
	} // Main End

		public static void makeScore(GradeVO gvo) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("학번 >>");
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
		}
		
	public static void viewScore(GradeVO v) {
		System.out.print(v.getStrNum()+ "\t");
		System.out.print(v.getIntKor()+ "\t");
		System.out.print(v.getIntEng()+ "\t");
		System.out.print(v.getIntMath()+ "\t");
		System.out.print(v.getIntSum()+ "\t");
		System.out.print(v.getFloatAvg()+ "\n");
	}
		
}
