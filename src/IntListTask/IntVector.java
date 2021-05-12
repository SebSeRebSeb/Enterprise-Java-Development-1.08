package IntListTask;

public class IntVector implements IntList {
    public int[] Test;

    public IntVector() {
        this.Test = new int[10];
    }

    public int getLength() {
        return this.Test.length;
    }

    @Override
    public void add(int val) {
        int length = this.Test.length;
        int c = val;
        int newArr[] = new int[length*2];
        for (int i = 0; i < length; i++) {
            if (i < length) {
                this.Test[i] = c;
            } else {
                int newLength = length * 2;;
                newArr[i] = c;
                System.arraycopy(this.Test, 0, newArr, 0, newLength);
                this.Test = newArr;
            }
        }

    }

    @Override
    public int get(int id) {
        return this.Test[id];
    }
}
