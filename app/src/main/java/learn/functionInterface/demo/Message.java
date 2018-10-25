package learn.functionInterface.demo;
@FunctionalInterface
public interface Message {

    public String getInfo();

    default void print(){
        System.out.println("hello function");
    }

    static void fun(){
        System.out.println("hell static fun");
    }
}
