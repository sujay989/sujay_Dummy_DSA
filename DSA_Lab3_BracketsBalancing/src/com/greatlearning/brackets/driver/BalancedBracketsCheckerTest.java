package com.greatlearning.brackets.driver;

import com.greatlearning.brackets.balancer.Result;

public class BalancedBracketsCheckerTest {
	
	public static void main(String[] args) {
		test("{[()]}");
		test("{}");
		test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("[<)]");
		test("[<");
		test("({[]<>})");
		test("({[]}<()>)");

	}
	
	private static void test(String brackets) {
		
		BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);
		Result result = checker.check();
		System.out.println(result);
	}

}
