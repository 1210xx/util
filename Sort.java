package pri.rj.pritice.util;

import java.lang.Math;
import java.util.Arrays;

public class Sort {
	
	public static int[] pendingSortArray = null;
	
	public int[] bubbleSort(int[] paraArray) {
		System.out.println(Arrays.toString(paraArray));
		for (int j = 1; j < paraArray.length; j++) {
			for (int i = 0; i < paraArray.length - j; i++) {
				int tempElem;
				if (paraArray[i] > paraArray[i + 1]) {
					tempElem = paraArray[i];
					paraArray[i] = paraArray[i + 1];
					paraArray[i + 1] = tempElem;
				} else
					continue;
			}
		}
		int[] result = paraArray;
		return result;
	}
	public int[] bubbleSort(int paraK,int[] paraArray) {
		
		int[] result = new int[paraK];
		return result;
	}
	
	public int[] generateRandomArray (int paraN, int paraBegin, int paraEnd) {
		int[] intArray = new int[paraN];
		for (int i = 0; i < paraN; i++) {
			intArray[i] = (int)(Math.random() * paraEnd) + paraBegin;
		}
		return intArray;
	}
	
	public double[] generateRandomArray (int paraN, double paraBegin, double paraEnd) {
		double[] doubleArray = new double[paraN];
		for (int i = 0; i < paraN; i++) {
			doubleArray[i] = (Math.random() * paraEnd) + paraBegin;
		}
		return doubleArray;
	}
	public static void main(String[] args) {
		Sort sort = new Sort();
		pendingSortArray = sort.generateRandomArray(9,2,7);
		System.out.println(Arrays.toString(sort.bubbleSort(pendingSortArray)));
	}
}
