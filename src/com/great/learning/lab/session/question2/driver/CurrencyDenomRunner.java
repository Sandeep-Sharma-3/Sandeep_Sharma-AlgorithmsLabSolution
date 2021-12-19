package com.great.learning.lab.session.question2.driver;

import java.util.Scanner;

import com.great.learning.lab.session.question2.service.CountTheNotes;

public class CurrencyDenomRunner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of currency denominations");
		int curr_deno_size = in.nextInt();
		
		System.out.println("Enter the currency denominations value");
		int i;
		int [] curr_deno_val = new int[curr_deno_size];
		for(i = 0; i < curr_deno_size; ++i) {
			curr_deno_val[i] = in.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = in.nextInt();
		
		CountTheNotes.countTheNotes(amount, curr_deno_val, curr_deno_size);
		
		in.close();
	}

}
