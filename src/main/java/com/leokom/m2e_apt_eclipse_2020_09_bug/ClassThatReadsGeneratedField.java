package com.leokom.m2e_apt_eclipse_2020_09_bug;

public class ClassThatReadsGeneratedField {

	public static void main(String[] args) {
		//the code compiles via mvn clean compile under JDK8 (even without jakarta.xml.bind dependency)
		//the code compiles via mvn clean compile under JDK11 (only with jakarta.xml.bind dependency)
		
		//the code compiles under Eclipse 2020-03 with m2e-apt 1.5.2

		//the code does NOT compile under Eclipse 2020-09 + m2e-apt 1.5.2 (running under JDK11) where the project JDK is JDK8
		//the code does NOT compile under Eclipse 2020-09 + m2e-apt 1.5.2 (running under JDK11) where the project JDK is JDK11
		System.out.println(SomeEntity_.name);
	}
}
