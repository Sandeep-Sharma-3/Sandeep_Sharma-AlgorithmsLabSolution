package com.great.learning.lab.session.question2.service;

public class CountTheNotes {
	public static void countTheNotes(int amount, int [] curr_deno_val, int curr_deno_size) {
		curr_deno_val = InsertionSortDescending.insertionSortDescending(curr_deno_val);
		
		System.out.println("Your payment approach in order to give min no of notes will be :");
		int i;
		for(i = 0; i < curr_deno_size; ++i) {
			if(amount/curr_deno_val[i] != 0) {
				System.out.println(curr_deno_val[i] + " : " + amount/curr_deno_val[i]);
				amount = amount%curr_deno_val[i];
			}
		}
		
		if(amount != 0) {
			System.out.println("Amount cannot be paid in these denominations.");
		}
	}
}
