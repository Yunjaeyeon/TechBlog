package chap3;

public class MouseDriver {
    public static void main(String[] args) {

        //클래스명.countOfTail
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        //객체명.countOfTail
        System.out.println("mickey = " + mickey);
        System.out.println("jerry = " + jerry);
        System.out.println("mightyMouse = " + mightyMouse);

        //클래스명.countOfTail
        System.out.println(Mouse.countOfTail);

    }
}
