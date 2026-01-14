package chapter12.hashcode;

public class KeyMain {

    public static void main(String[] args) {

        /*
         * 🔹 int 값을 가진 Key 객체 2개 생성
         * - 값은 같지만 (1)
         * - new를 사용했기 때문에 서로 다른 객체
         */
        Key hashKey1 = new Key(1);
        Key hashKey2 = new Key(1);

        /*
         * 🔹 String 값을 가진 Key 객체 2개 생성
         * - 문자열 내용은 같음 ("김자바")
         * - 하지만 new로 만들었으므로 객체는 다름
         */
        Key hashKey3 = new Key("김자바");
        Key hashKey4 = new Key("김자바");

        /*
         * 🔹 객체 출력
         * - toString()을 오버라이드하지 않았기 때문에
         * - Object.toString() 실행
         * - 클래스명@해시코드 형태 출력
         */
        
        //물리적 주소
        System.out.println(hashKey1);
        System.out.println(hashKey2);
        System.out.println(hashKey3);
        System.out.println(hashKey4);

        /*
         * 🔹 int 기반 Key 비교
         * - equals()에서 number 값을 비교하도록 구현됨
         * - 둘 다 number == 1
         */
        // int num = hashKey1.number; // ERROR
        if (hashKey1.equals(hashKey2)) {
            System.out.println("True");   // 값이 같음
        } else {
            System.out.println("False");
        }

        /*
         * 🔹 String 기반 Key 비교
         * - equals()에서 name.equals() 사용
         * - 문자열 내용이 같기 때문에 true
         */
        if (hashKey3.equals(hashKey4)) {
            System.out.println("True");   // 값이 같음
        } else {
            System.out.println("False");
        }
    }
}
