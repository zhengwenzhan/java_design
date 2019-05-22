package studyjvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-05-15
 */


public class FillHeap {

    public static void main(String[] args) throws InterruptedException {
        fillHeap(10000);
    }


    private static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }

        System.gc();
    }

    static class OOMObject {
        public byte[] placeHolder = new byte[64 * 1024];
    }

}
