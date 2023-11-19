package comparingAlgorithms;

import java.util.Random;

//source: https://www.geeksforgeeks.org/comb-sort/

public class SortingAlgorithmsComparison {
		static int compareCounter = 0;
		static int dataMovementCounter = 0;
	public static void main(String[] args) {
		//bubble sort section
		System.out.println("Bubble Sort Results: ");
		int[] bubblearr1 = randomNumberGenerator(100);
		bubbleSort(bubblearr1);
		System.out.println("For Array size 100: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] bubblearr2 = randomNumberGenerator(200);
		bubbleSort(bubblearr2);
		System.out.println("For Array size 200: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] bubblearr3 = randomNumberGenerator(300);
		bubbleSort(bubblearr3);
		System.out.println("For Array size 300: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] bubblearr4 = randomNumberGenerator(400);
		bubbleSort(bubblearr4);
		System.out.println("For Array size 400: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] bubblearr5 = randomNumberGenerator(500);
		bubbleSort(bubblearr5);
		System.out.println("For Array size 500: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		//quick sort section
		System.out.println("Quick Sort Results: ");
		int[] quickarr1 = randomNumberGenerator(5);
		bubbleSort(quickarr1);
		System.out.println("For Array size 5: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] quickarr2 = randomNumberGenerator(50);
		bubbleSort(quickarr2);
		System.out.println("For Array size 50: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] quickarr3 = randomNumberGenerator(500);
		bubbleSort(quickarr3);
		System.out.println("For Array size 500: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] quickarr4 = randomNumberGenerator(5000);
		bubbleSort(quickarr4);
		System.out.println("For Array size 5000: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] quickarr5 = randomNumberGenerator(50000);
		bubbleSort(quickarr5);
		System.out.println("For Array size 50000: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		//comb sort section
		System.out.println("Comb Sort Results: ");
		int[] combarr1 = randomNumberGenerator(5);
		bubbleSort(combarr1);
		System.out.println("For Array size 5: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] combarr2 = randomNumberGenerator(50);
		bubbleSort(combarr2);
		System.out.println("For Array size 50: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] combarr3 = randomNumberGenerator(500);
		bubbleSort(combarr3);
		System.out.println("For Array size 500: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] combarr4 = randomNumberGenerator(5000);
		bubbleSort(combarr4);
		System.out.println("For Array size 5000: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
		
		int[] combarr5 = randomNumberGenerator(50000);
		bubbleSort(combarr5);
		System.out.println("For Array size 50000: compareCounter = " + compareCounter + " dataMovementCounter = " + dataMovementCounter);
		compareCounter = 0;
		dataMovementCounter=0;
	}
	
	private static int[] randomNumberGenerator(int size){
		int[] randomNumbers = new int[size];
		Random random = new Random();
		
		for (int i = 0; i<size; i++) {
			randomNumbers[i] = random.nextInt();
		}
		
		return randomNumbers;
		
	}
	
	
	private static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
            	compareCounter++;
                if (arr[j] > arr[j + 1]) {
                	dataMovementCounter++;
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
    
        }
		
	} 
	
	private static void quickSort(int[] arr, int low, int high) {
		compareCounter++;
	     if (low < high) {
	            // Partition the array and get the pivot index
	            int pivotIndex = partition(arr, low, high);
	            
	            // Recursively sort the elements before and after the pivot
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
		
	}
	
	//used for the quick sort algorithm
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element
		
		for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
            	dataMovementCounter++;
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
		dataMovementCounter++;
        // Swap arr[i+1] and arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
		
	}
	
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < n - gap; i++) {
            	compareCounter++;
                if (arr[i] > arr[i + gap]) {
                	dataMovementCounter++;
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    //helper method for comb sort
    public static int getNextGap(int gap) {
        // Shrink gap by a factor of 1.3
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }


}

