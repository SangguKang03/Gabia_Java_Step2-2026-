package chapter12.clone;

/*
 * Book 클래스
 * - Object.clone()을 사용하기 위해 Cloneable 인터페이스를 구현
 */
class Book implements Cloneable {

    // 멤버 변수 (참조형이지만 String은 불변 객체)
    String title;

    // 생성자: 책 제목을 받아 초기화
    public Book(String title) {
        this.title = title;
    }

    // 제목 getter
    public String getTitle() {
        return title;
    }

    // 제목 setter
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * clone() 메서드 오버라이드
     *
     * - Object의 clone()은 protected 이기 때문에
     *   자식 클래스에서 오버라이드 필요
     * - super.clone()을 호출하면
     *   👉 "얕은 복사(shallow copy)" 수행
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
     * 객체를 출력할 때 자동으로 호출되는 메서드
     * System.out.println(book);
     * → 내부적으로 book.toString() 호출됨
     */
    @Override
    public String toString() {
        return title;
    }

} // Book 클래스 끝


public class MyBook_03 {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
         * book1 객체 생성
         * title = "Java"
         */
        Book book1 = new Book("Java");

        // book1의 title 출력
        System.out.println(book1.title);   // Java

        /*
         * book1을 clone()으로 복제
         *
         * - 새로운 Book 객체가 생성됨
         * - book1과 book2는 "서로 다른 객체"
         * - 멤버 변수 값만 동일
         */
        Book book2 = (Book) book1.clone();

        // book2 출력 → toString() 호출 → title 출력
        System.out.println(book2);          // Java

        /*
         * book2의 title 변경
         * - book2만 변경됨
         * - book1에는 영향 없음
         */
        book2.setTitle("오라클");

        // 변경된 book2 출력
        System.out.println(book2);          // 오라클

        // (확인용) book1은 여전히 Java
        System.out.println(book1);          // Java
    }
}
