package org.practice.app;

import java.util.ArrayList;
import java.util.List;

import org.practice.utils.immutable.ImmutableExample;

public class ImmutableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> mySubjects = new ArrayList<String>();
		mySubjects.add("English");
		mySubjects.add("Hindi");
		mySubjects.add("Maths");
		mySubjects.add("Social Studies");
		mySubjects.add("Science");
		
		ImmutableExample im = new ImmutableExample(23, "Vishesh", "10th", mySubjects);
		
		System.out.println(im.toString());
		
		im.getSubjects().add("Physical education");
		
		System.out.println(im.toString());
		
	}

}
