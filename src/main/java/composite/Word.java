package composite;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class Word extends AbsLetterComposite {

    public Word(List<Letter> list) {
        list.forEach(letter -> this.add(letter));
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }

    @Override
    protected void printThisAfter() {

    }
}
