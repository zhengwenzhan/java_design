package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public abstract class AbsLetterComposite {

    private List<AbsLetterComposite> children = new ArrayList<>();

    public void add(AbsLetterComposite absLetterComposite) {
        children.add(absLetterComposite);
    }

    public int count() {
        return children.size();
    }

    protected abstract void printThisBefore();

    protected abstract void printThisAfter();

    public void print() {
        printThisBefore();

        children.forEach(child -> child.print());

        printThisAfter();

    }


}
