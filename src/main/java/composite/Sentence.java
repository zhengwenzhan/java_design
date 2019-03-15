package composite;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class Sentence extends AbsLetterComposite {

    public Sentence(List<Word> words) {
        words.forEach(word -> this.add(word));
    }

    @Override
    protected void printThisBefore() {

    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
