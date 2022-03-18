package day14.ex;

import day14.Nemo;

public class won {
	private int radius;
	private double area, circle;
	public won() {}
	public won(int radius) {
		this.radius = radius;
		setArea();
		setCircle();
	}
	public void setArea() {
		area = radius * radius * Math.PI;
	}
	public void setCircle() {
		circle = 2 * radius * Math.PI;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getCircle() {
		return circle;
	}
	public void setCircle(double Circle) {
		circle = circle;
	}
	@Override
	public String toString() {
		return "원의 - 반지름 - : " +radius +" ,둘레 :" + circle + ", 면적 : " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		//반환값 변수
		boolean bool = false;
		
		//입력된 데이터를 원래형태로 강제형변환해준다.
		won nam = null;
		try {
			nam = (won) o;
		}catch(Exception e) {
			//만약 입력된 객체가 won로 강제형변환 할 때 예외가 발생하면
			//이 작업 이후의 모든 작업들은 실행자체가 무의미해진다.
			//
		}
		//남의꺼 면적 꺼내오고
		double myunjuk = nam.getArea();
		
		bool = area == myunjuk;
		
		return bool;
		
	}
}