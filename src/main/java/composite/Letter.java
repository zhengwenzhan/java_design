package composite;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class Letter extends AbsLetterComposite {
    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }

    @Override
    protected void printThisAfter() {

    }
}
