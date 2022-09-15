package com.yash.collection_StudentMark_Task7;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSname().compareTo(o2.getSname());
	}

}
