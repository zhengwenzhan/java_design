package studyjvm;

/**
 * Created by zhengwenzhan on 2019-05-26
 */
public class StaticDispatch {

    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }

    public void sayHello(Human human) {
        System.out.println("human say hello.");
    }

    public void sayHello(Man man) {
        System.out.println("man say hello.");
    }

    public void sayHello(Woman woman) {
        System.out.println("woman say hello.");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();

        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello((Man)man);
        staticDispatch.sayHello(woman);

    }

}
