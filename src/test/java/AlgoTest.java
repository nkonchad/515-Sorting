package test.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	
//	@Test
//	public void testBubbleSort() {
//		Item a[] = new Item[5];
//		a[0] = new Item(5);
//		a[1] = new Item(1);
//		a[2] = new Item(9);
//		a[3] = new Item(50);
//		a[4] = new Item(12);
//		SortAlgos.bubbleSort(a);
//		int b[] = new int[5];
//		for (int i =0; i<b.length; i++)
//		{
//			b[i] = a[i].key;
//		}
//		int res[] = new int[] {1, 5, 9, 12, 50};
//		Assert.assertArrayEquals(b, res);
//	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayBubbleSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.bubbleSort(arr.myArray);
	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayInsertionSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.insertionSort(arr.myArray);
	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayHeapSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.heapSort(arr.myArray);
	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayquickSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.quickSort(arr.myArray);
	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arraymergeSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.mergeSort(arr.myArray);
	}
	
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
	
	@Test  (expected=java.lang.NullPointerException.class)
	public void arrayselectionSortNull() {
		SortDemoData arr = new SortDemoData();
		
		SortAlgos.selectionSort(arr.myArray);
	}
	

}
