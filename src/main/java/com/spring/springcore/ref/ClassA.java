package com.spring.springcore.ref;

public class ClassA {

	private String classAVar1;
	private ClassB objectB;

	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getClassAVar1() {
		return classAVar1;
	}

	public void setClassAVar1(String classAVar1) {
		this.classAVar1 = classAVar1;
	}

	public ClassB getObjectB() {
		return objectB;
	}

	public void setObjectB(ClassB objectB) {
		this.objectB = objectB;
	}

	@Override
	public String toString() {
		return "ClassA [classAVar1=" + classAVar1 + ", objectB=" + objectB + "]";
	}

}
