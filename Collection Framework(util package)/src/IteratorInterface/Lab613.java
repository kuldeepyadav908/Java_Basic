package IteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab613 {

	public static void main(String[] args) {
		List list = new ArrayList();
		Iterator it = list.iterator();
		System.out.println(it.next());//java.util.NoSuchElementException
		System.out.println("Main Completed");

	}

}
