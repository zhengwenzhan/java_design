package composite;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        AbsLetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("\n");

        System.out.println("Message from the elves: ");

        AbsLetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();

    }
}
