package org.practice.utils.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {

	private int studentId;
	private String studentName;
	private String studentClass;
	private List<String> subjects;
	
	public ImmutableExample(int studentId, String studentName, String studentClass, List<String> subjects) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		
		List<String> tmpList = new ArrayList<String>();
		for(String s : subjects) {
			tmpList.add(s);
		}
		this.subjects = tmpList;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	//Implementing Deep copy of List
	public List<String> getSubjects() {
		List<String> tmpList = new ArrayList<String>();
		for(String s : subjects) {
			tmpList.add(s);
		}
		return tmpList;
	}

	@Override
	public String toString() {
		return "ImmutableExample [studentId=" + studentId + ", studentName=" + studentName + ", studentClass="
				+ studentClass + ", subjects=" + subjects + "]";
	}
	
	
}
