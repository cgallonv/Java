package clases.udemy.sorting.util;

import java.util.List;

import clases.udemy.sorting.algorithm.BubbleSort;

public class MySortingUtil {
	public List<String> sort(List<String> names) {
		BubbleSort bubblesort = new BubbleSort();
		return bubblesort.sort(names);
	}
}
