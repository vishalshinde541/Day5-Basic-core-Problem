package com.Bridgelabz.FlipTheCoin;

public class FlipCoinAndPrintPercentageOfHeadsandTails {
	
	static int isHeadOrTail;
	static int totalFlipOfCoin = 10;
	
	public static void main(String[] args) {
		int totalCountOfHeadAndTail = 0;
		int headCount = 0;
		int tailCount = 0;
		
		for (int i = 0; i < totalFlipOfCoin; i++) {
			isHeadOrTail = checkHeadOrTail();
			if (isHeadOrTail == 0) {
				headCount += 1;
				totalCountOfHeadAndTail += 1;
			}else {
				tailCount += 1;
				totalCountOfHeadAndTail += 1;
			}
		}
		
		float percentOfHeadCount = 100*headCount/10;
		float percentOfTailCount = 100*tailCount/10;
		
		System.out.println("When coin fliped " + totalFlipOfCoin + " times");
		System.out.println("Percentage of Head count is : " + percentOfHeadCount + " %");
		System.out.println("Percentage of Tail count is : " + percentOfTailCount + " %");
		
	}
	static int checkHeadOrTail() {
		int n1 = (int) (Math.random()*2);
		return n1;
		
	}

}
