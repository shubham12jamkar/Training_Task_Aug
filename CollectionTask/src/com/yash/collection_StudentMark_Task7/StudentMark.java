package com.yash.collection_StudentMark_Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMark {

	List<Student> l = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int totalmark;
	int count = 0;
	int no;

	public void addStudent() {
		System.out.println("Enter no of student you want to add");
		no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			Student s = new Student();
			System.out.println("Enter stu rollno: ");
			s.setRollno(sc.nextInt());
			System.out.println("Enter stu name: ");
			s.setSname(sc.next());
			System.out.println("Enter stu classname: ");
			s.setClassname(sc.next());
			System.out.println("Enter stu total mark: ");
			s.setTotalmarks(sc.nextInt());

			l.add(s);
			count++;
		}
	}

	public void getSecureFirst() {
		if (count > 0) {

			int position = 0;
			totalmark = l.get(0).getTotalmarks();

			for (int i = 0; i < no; i++) {
				if (totalmark < l.get(i).getTotalmarks()) {
					totalmark = l.get(i).getTotalmarks();
					position = i;
				}

			}
			System.out.println("Secure first rank: " + "\nRoll No:" + l.get(position).getRollno() + "\nStudent name:"
					+ l.get(position).getSname() + "\nClass name: " + l.get(position).getClassname() + "\nTotal marks: "
					+ l.get(position).getTotalmarks());
		} else {
			System.out.println("add student data first");
		}
	}

	public void getLess50() {
		// Print name of those students who’s marks are below 50%.
		if (count > 0) {
			Iterator<Student> itr = l.iterator();

			while (itr.hasNext()) {
				Student s = itr.next();

				if (s.getTotalmarks() < 250) {
					System.out.println("----------------------------");
					System.out.println(s.getRollno());
					System.out.println(s.getSname());
					System.out.println(s.getClassname());
					System.out.println(s.getTotalmarks());
					System.out.println("-----------------------------");
				}
			}
		} else {
			System.out.println("add stu data first");
		}

	}

	public void failStudent() {
		// Print name of those students who’s marks are below 35% it means they are fail.
		if (count > 0) {
			Iterator<Student> itr = l.iterator();

			while (itr.hasNext()) {
				Student s = itr.next();

				if (s.getTotalmarks() < 175) {
					System.out.println("------------------------------");
					System.out.println(s.getRollno());
					System.out.println(s.getSname());
					System.out.println(s.getClassname());
					System.out.println(s.getTotalmarks());
					System.out.println("-------------------------------");
				}
			}
		} else {
			System.out.println("add stu data first");
		}
	}

	public void sortbymarks() {
		Collections.sort(l, new Marksort());

		for (Student s : l) {

//				System.out.println(s.getTotalmarks());
//				System.out.println(s.getRollno());
//				System.out.println(s.getSname());
//				System.out.println(s.getClassname());
			System.out.println(s);
		}

	}

	public void sortbyName() {
		Collections.sort(l, new NameSort());
		for (Student s : l) {
			System.out.println(s);
		}
	}

	public void sortByAverage() {

		int totalmark1 = 0;
		int count1 = 0;
		for (int i = 0; i < no; i++) {

			totalmark1 = totalmark1 + l.get(i).getTotalmarks();
			count1++;

		}
		int a = totalmark1 / count1;
		for (int j = 0; j < no; j++) {
			if (a <= l.get(j).getTotalmarks()) {
				System.out.println("student whoes mark greater than average: " + l.get(j).getSname() + ":"
						+ l.get(j).getTotalmarks());
			}
		}

	}

	public static void main(String[] args) {

		StudentMark sm = new StudentMark();
		while (true) {
			System.out.println("=============================");
			System.out.println("Enter 1 for add Student" + "\nEnter 2 for get secure first rank"
					+ "\nEnter 3 get less than 50%" + "\nEnter 4 for get less than 35% means fail student"
					+ "\nEnter 5 for sort by mark" + "\nEnter 6 for sort by name" + "\nEnter 7 for average sort");
			System.out.println("=============================");
			Scanner sc1 = new Scanner(System.in);
			int ch = sc1.nextInt();
			switch (ch) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.getSecureFirst();
				break;
			case 3:
				sm.getLess50();
				break;
			case 4:
				sm.failStudent();
				break;
			case 5:
				sm.sortbymarks();
				break;
			case 6:
				sm.sortbyName();
				break;
			case 7:
				sm.sortByAverage();
				break;
			}
		}

	}

}
