package com.great.learning.lab.session.question1;

import java.util.Scanner;

public class PayMoneyTransactions {

	static public void checkTarget(int [] trans_list, int target, int trans_size) {
		int i, sum = 0;
		
		for(i = 0; i < trans_size; ++i) {
			sum += trans_list[i];
			if(sum >= target) {
				System.out.println("Target achieved after " + (i+1) + " transactions.");
				break;
			}
		}
		
		if(sum < target) {
			System.out.println("Given target is not achieved.");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array : ");
		int trans_size = in.nextInt();
		
		int [] trans_list = new int[trans_size];
		System.out.println("Enter the values of array : ");
		
		int i;
		for(i = 0; i < trans_size; ++i) {
			trans_list[i] = in.nextInt();
		}
		
		System.out.println("Enter the total number of targets that needs to be achieved : ");
		int number_of_targets = in.nextInt();
		int [] target = new int[number_of_targets];
		
		for(i = 0; i < number_of_targets; ++i) {
			System.out.println("\nEnter the value of target " + (i+1));
			target[i] = in.nextInt();
			checkTarget(trans_list, target[i], trans_size);
		}
		
		in.close();
	}

}
