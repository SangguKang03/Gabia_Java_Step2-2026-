package chapter11;

// 외부 클래스
class OutterRunnable {

    /*
     * Runnable 인터페이스를 구현한
     * "익명 내부 클래스" 객체를 멤버 변수로 선언
     *
     * → 클래스 이름이 없음
     * → new Runnable() { ... } 자체가 객체
     */
    Runnable runner = new Runnable() {

        /*
         * Runnable 인터페이스의 run() 메서드 구현
         */
        @Override
        public void run() {
            System.out.println("Runnable 구현된 익명의 클래스 변수");
        }
    };
}

// 실행 클래스
public class AnonyMousInnerMain_06 {

    public static void main(String[] args) {

        // 외부 클래스 객체 생성
        OutterRunnable out = new OutterRunnable();

        // 익명 내부 클래스 객체의 run() 실행
        out.runner.run();
    }
}
