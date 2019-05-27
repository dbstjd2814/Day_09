package kh.uml.e04_dependency;

public class Blacksmith {
	private Sword sword = new Sword();
	//comPosition
	private Shield shield;
	
	public void setShile(Shild s) {
		this.shield = s;
		// 외부클래스 인스턴스를 내부 멤버필드에 저장하고 사용하는 관계로
		// Association 관계라고 볼 수 있다.
		// 하지만 쉴드 인스턴스의 생명주기는 블랙스미스 생명주기와 일치하지 않으므로
		// Aggregation 관계라고 부른다. (약 연관)
	}
	public void useHammer(Hammer h) {
			h.hit();
			//외부 클래스를 의존하지만 메서드 수준에서 일시적으로 사용하고 소멸하는 방식이면
			//Dependency 관계 라고 부른다. 점선 화살표
	}
}
