package chapter12.hashcode;

/*
 * Key 클래스
 *
 * 📌 이 클래스의 목적
 * - equals()와 hashCode()를 "오버라이드했을 때"
 *   실제로 어떤 동작을 하는지 설명하기 위한 예제
 *
 * ⚠ 현재 상태:
 * - equals()와 hashCode()를 오버라이드했지만
 * - Object 클래스의 동작을 그대로 사용하고 있음
 * → 결과적으로 "주소 비교 객체"
 */
public class Key {

    // 정수 값 저장용 변수
    public int number;

    // 문자열 값 저장용 변수
    public String name;

    // 주소 값처럼 보이게 만든 예제용 변수 (현재 코드에서는 사용 안 됨)
    public int addr;

    /*
     * int 값을 받는 생성자
     * → new Key(1) 같은 경우 사용됨
     */
    public Key(int number) {
        this.number = number;
    }

    /*
     * String 값을 받는 생성자
     * → new Key("김자바") 같은 경우 사용됨
     */
    public Key(String name) {
        this.name = name;
    }

    /*
     * hashCode() 메서드
     *
     * 👉 오버라이드는 했지만,
     *    내부 구현은 super.hashCode()
     *
     * 👉 의미:
     * - Object.hashCode()를 그대로 사용
     * - 객체의 "메모리 주소 기반 해시값"
     * - 값(number, name)은 전혀 고려 안 함
     */
    @Override
    public int hashCode() {
        //return super.hashCode(); // 실제 heap메모리 주소(16진수)
    	return number;
    }

    /*
     * equals() 메서드
     *
     * 👉 오버라이드는 했지만,
     *    super.equals(obj)를 그대로 호출
     *
     * 👉 실제 동작:
     * Object.equals() →
     * return (this == obj);
     *
     * 즉,
     * - 두 객체의 주소가 같을 때만 true
     * - 값이 같아도 객체가 다르면 false
     */
    @Override 
    public boolean equals(Object obj) {
    	//obj: 부모
    	if(obj instanceof Key) {
    		Key compareKey = (Key) obj; // object는 최상위이기 key로 다운 캐스팅을 필수적으로 해줘야한다
    		if(this.number == compareKey.number) {
    			return true;
    		}
    	}else {
    		return false;
    	}
    	
    	
        return super.equals(obj);
    }
}
