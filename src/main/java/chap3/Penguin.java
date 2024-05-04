package chap3;

public class Penguin extends Animal{
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s is live in %s", name, habitat);
    }

    //오버라이딩 - 재정의 : 싱위클래스의 메서드와 같은 메서드 이름, 같은 인자 리스트
    public void showName() {
        System.out.println("aaaaaaaaa");
    }

    // 오버로딩 - 중복정의 : 같은 메서드 이름, 다른 인자 리스트
    public void showName(String yourName) {
        System.out.printf("Hello, %s, my name is %s\n", yourName, name);
    }
}
