package generic_collection;

import java.util.ArrayList;

public class DynamicArray {
	public static void main(String[] args) {
		int[] scoreArray = new int[10];
		scoreArray[0] = 100;
		scoreArray[1] = 80;
		scoreArray[2] = 90;
		scoreArray[3] = 70;
		scoreArray[4] = 50;
		scoreArray[5] = 45;
		scoreArray[6] = 56;
		scoreArray[9] = 95;
		
		// scoreArray에 값 하나를 더 넣으려면 어떻게 해야 하나?
		// 학급의 학생이 10명이 있었다.
		// 선생은 10명은 학생 점수를 관리하고 있었다.
		// int[] scoreArray = new int[10];
		// 학기가 종료되기 전에 1명의 학생이 전학을 왔다.
		// 11명의 학생 점수를 관리해야한다.
		int[] scoreArray2 = new int[scoreArray.length + 1];

		System.arraycopy(scoreArray, 0, scoreArray2, 0, scoreArray.length);
		//arraycopy(원본배열이름,원본배열몇번째인덱스부터,복사할배열이름,복사할배열몇번째인덱스부터,복사할 길이)
		
//		for(int i = 0; i<scoreArray.length; i++) {
//			scoreArray2[i] = scoreArray[i];
//		}
//		
//		for(int i = 0; i<scoreArray2.length; i++) {
//			System.out.println(scoreArray2[i]);
//		}
	}
}
