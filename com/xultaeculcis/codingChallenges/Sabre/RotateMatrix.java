package com.xultaeculcis.codingChallenges.Sabre;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class RotateMatrix {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int[][] result = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				result[j][n - i - 1] = matrix[i][j];
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(Arrays.deepToString(result));
	}
}
