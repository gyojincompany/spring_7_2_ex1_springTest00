package com.gyojincompany.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();//컨테이너 ctx 생성!
		
		ctx.load("classpath:applicationCTX.xml");//컨테이너 파일 설정
		ctx.refresh();//컨테이너 재로딩(컨테이너 설정)
		
		Student stu1 = ctx.getBean("student1", Student.class);//컨테이너 사용		
		System.out.println(stu1.getName());//컨테이너 사용
		
		OtherStudent otherStu1 = ctx.getBean("otherStudent", OtherStudent.class);
		System.out.println(otherStu1.getName());//컨테이너 사용
		
		
		ctx.close();//컨테이너 종료
		
		Student stu00 = new Student("홍길수", 20);
		Student stu01 = new Student("홍길장", 22);
		Student stu02 = new Student("홍길식", 21);
		
	}

}
