package chapter07;

public class Guest {

    // ===== 멤버 변수(필드) =====

    // 관광객 이름
    // private → 외부 클래스에서 직접 접근 불가
    private String name;

    // 관광객 성별
    // private → 반드시 메서드를 통해서만 접근 가능
    private String gender;


    // ===== getter / setter 메서드 =====
    // ※ 생성자가 아니라 "접근 메서드"임 (많이 헷갈리는 부분!)

    // name 값을 가져오는 메서드 (읽기)
    public String getName() {
        return name;
    }

    // name 값을 설정하는 메서드 (쓰기)
    public void setName(String name) {
        // 매개변수 name을 멤버변수 name에 저장
        // this.name → 멤버변수
        // name → 매개변수
        this.name = name;
    }

    // gender 값을 가져오는 메서드 (읽기)
    public String getGender() {
        return gender;
    }

    // gender 값을 설정하는 메서드 (쓰기)
    public void setGender(String gender) {
        this.gender = gender;
    }
}
