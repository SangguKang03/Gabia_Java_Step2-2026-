package chapter11;

// 외부 클래스
class Outter {

    // 외부 클래스의 인스턴스 멤버 변수
    int outNum = 100;

    // 외부 클래스의 static 멤버 변수 (클래스 변수)
    static int sNum = 200;

    /*
     * Runnable 객체를 반환하는 메서드
     * → 이 메서드 안에서 "지역 내부 클래스"가 선언됨
     */
    Runnable getRunnable(int i) { 
        // 매개변수 i는 내부 클래스에서 사용 가능
        // (자바 8 이후: final을 안 써도 "사실상 final"이면 가능)

        int num = 100; 
        // 지역 변수
        // 지역 내부 클래스에서 사용되기 때문에
        // 값이 변경되지 않는 "사실상 final" 상태여야 함

        /*
         * 지역 내부 클래스
         * - 메서드 안에서만 사용 가능
         * - Runnable 인터페이스 구현
         */
        class MyRunnable implements Runnable {

            // 지역 내부 클래스의 멤버 변수
            int localNum = 10;

            @Override
            public void run() {

                // 메서드의 지역 변수 사용 가능 (final 또는 사실상 final)
                System.out.println("num = " + num);

                // 지역 내부 클래스 자신의 멤버 변수
                System.out.println("localNum=" + localNum);

                // 외부 클래스의 인스턴스 변수 접근 가능
                System.out.println("(외부)outNum=" + outNum);

                // 외부 클래스의 static 변수 접근 가능
                System.out.println("(외부 Metaspace)sNum=" + Outter.sNum);
            }
        }

        // 지역 내부 클래스의 객체를 생성해서 반환
        return new MyRunnable();
    }
}

// 실행 클래스
public class LocalInner_04 {

    public static void main(String[] args) {

        // 외부 클래스 객체 생성
        Outter out = new Outter();

        // getRunnable()이 Runnable 객체를 반환함
        Runnable runner = out.getRunnable(10);

        // run() 실행
        runner.run();
    }
}
