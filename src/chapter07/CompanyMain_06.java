package chapter07;

public class CompanyMain_06 {

    public static void main(String[] args) {

        // ===== 일반 객체 생성 =====
        // new 키워드를 사용하면
        // Heap 영역에 Company 객체가 새로 생성됨
        Company company1 = new Company();
        Company company2 = new Company();

        // 서로 다른 객체이므로
        // 출력되는 주소값(참조값)이 다름
        System.out.println(company1);
        System.out.println(company2);


        System.out.println("--------------------singleton--------------------");


        // ===== 싱글톤 방식 객체 생성 =====
        // getInstance()는 static 메서드
        // Company 클래스 내부에 이미 만들어진
        // 단 하나의 객체를 반환함

        // MetaSpace(클래스 영역)에 있는 static 변수에 저장된
        // Company 객체를 가져옴
        Company Mycompany1 = Company.getIntance();
        Company Mycompany2 = Company.getIntance();

        // 두 변수는 서로 다른 변수가 아니라
        // 같은 Company 객체를 참조함
        System.out.println(Mycompany1);
        System.out.println(Mycompany2);

        // 참조값(주소)을 비교
        // 같은 객체이므로 true 출력
        System.out.println(Mycompany1 == Mycompany2);
    }
}
