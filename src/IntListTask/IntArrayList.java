package IntListTask;


import java.util.ArrayList;

public class IntArrayList implements IntList {
    public ArrayList<Integer> IntArrayList = new ArrayList<Integer>(10);
    public int sizeStart = 10;

    @Override
    public void add(int val) {
        int length = IntArrayList.size();
        int c = val;
        for (int i = 1; i < length; i++) {
            if (i > length) {
                IntArrayList.ensureCapacity(sizeStart / 2 * 3);
                sizeStart = sizeStart / 2 * 3;
                IntArrayList.add(i, c);
            } else {
                IntArrayList.add(i, c);
            }
        }

    }

    public int getSize() {
        return IntArrayList.size();
    }

    @Override
    public int get(int id) {
        return IntArrayList.get(id);
    }
}
