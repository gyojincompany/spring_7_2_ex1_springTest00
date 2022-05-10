package com.gyojincompany.spring_7_2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public void destroy() throws Exception {//빈이 소멸되는 시점에서 자동 호출
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드 호출됨!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {//빈의 초기화 시점에서 자동 호출
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet 메서드 호출됨!!");
	}

}
