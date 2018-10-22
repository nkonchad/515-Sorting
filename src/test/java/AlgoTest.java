package test.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testBubbleSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.bubbleSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayBubbleSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.bubbleSort(arr.myArray);
	}
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testInsertionSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.insertionSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayInsertionSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.insertionSort(arr.myArray);
	}
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testHeapSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.heapSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayHeapSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.heapSort(arr.myArray);
	}
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testquickSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.quickSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayquickSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.quickSort(arr.myArray);
	}
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testmergeSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.mergeSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arraymergeSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.mergeSort(arr.myArray);
	}
	
	// This method tests for an Average array sequence ( i.e random elements in an array)
	// This covers Node, Condition  and Edge Coverage
	
	@Test
	public void testselectionSort() {
		SortDemoData arr = new SortDemoData();
		arr.initializeArray("5 1 9 50 12");
		
		SortAlgos.selectionSort(arr.myArray);
		
		SortDemoData arr1 = new SortDemoData();
		arr1.initializeArray("1 5 9 12 50");
		
		assertTrue(arr.myArray[0].key == arr1.myArray[0].key );
		assertTrue(arr.myArray[1].key == arr1.myArray[1].key );
		assertTrue(arr.myArray[2].key == arr1.myArray[2].key );
		assertTrue(arr.myArray[3].key == arr1.myArray[3].key );
		assertTrue(arr.myArray[4].key == arr1.myArray[4].key );
	}
	
	// This method tests for a Null array sequence
	// This covers Node, Condition  and Edge Coverage
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayselectionSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.selectionSort(arr.myArray);
	}
	

}
