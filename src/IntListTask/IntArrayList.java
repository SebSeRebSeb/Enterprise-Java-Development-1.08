package IntListTask;


import java.util.ArrayList;

public class IntArrayList implements IntList{
    public ArrayList<Integer> IntArrayList = new ArrayList<Integer>(10);

    @Override
    public void add(int val) {
        int length = IntArrayList.size();
        int c = val;
        for( int i= 1; i<length;i++){
            if (i > length) {
                int newLength = length / 2 * (3);
                IntArrayList.ensureCapacity(newLength);
            }
            IntArrayList.set(i, c);
        }

    }
    @Override
    public int get(int id) {
        return IntArrayList.get(id);
    }
}
