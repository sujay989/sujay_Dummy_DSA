package com.greatlearning.driver;

import com.greatlearning.pairfinder.BinarySearchTree;
import com.greatlearning.pairfinder.TestDataUtils;

import internal.Log;

public class BSTPairFinderTest {

	public static void main(String[] args) {
						
		test(130);
		test(60);
		test(190);
		test(500); //invalid data
	}

	private static void test(int sum) {
		
//		Log.ENABLE = true;
		
		BinarySearchTree tree = TestDataUtils.sampleBST1();

//		Log.ENABLE = true;

		BSTPairFinder finder 
			= new BSTPairFinder(tree);
		
		finder.findPair(sum);
		
		System.out.println("-----------------------");

		Log.ENABLE = false;

	}
}
