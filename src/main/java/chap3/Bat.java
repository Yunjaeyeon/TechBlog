package chap3;

public class Bat extends Bird implements Fly {
    Bat(){
        myClass = "Bat";
    }
    @Override
    public void fly(){
        System.out.println(myClass + " Flying ... !!!!!!");
    }
}
