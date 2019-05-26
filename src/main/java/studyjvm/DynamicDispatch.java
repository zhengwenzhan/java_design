package studyjvm;

/**
 * Created by zhengwenzhan on 2019-05-26
 */
public class DynamicDispatch {
    static abstract class Human {
        abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        void sayHello() {
            System.out.println("man say hello.");
        }
    }

    static class Woman extends Human {
        @Override
        void sayHello() {
            System.out.println("woman say hello.");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();

        man.sayHello();
        woman.sayHello();
    }

}
