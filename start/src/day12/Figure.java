package day12;

/*
 * 	이 클래스는 삼각형 사각형 원의 정보를 기억할 클래스들의ㅣ
 * 	상위 클래스로서 사용할 예정인데
 * 	추상클래스로 작성해서
 * 	연습해본다.
 */

public abstract class Figure {
	public abstract void setArea(); // 면적을 셋팅해주는 추상함수
	// 따라서 이 함수는 몸체 (내용{}) 을 가지면 안된다.
	public abstract void toPrint();	// 이 클래스의 정보를 출력해주는 함수
	
	/*
	 * 위 함수들은 이 클래스를 상속받아서 만드는 각 도형 클래스에서
	 * 각 함수의 내용들이 모두 달라지므로
	 * 상속 받은 
	 */
	
	


}
