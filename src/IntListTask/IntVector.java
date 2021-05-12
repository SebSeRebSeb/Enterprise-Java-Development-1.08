package IntListTask;

public class IntVector implements IntList{
    public Integer[] Test = new Integer[10];

    //Setter and Constructor Method to change Test Arr



    public void setTest(Integer[] test) {
        Test = test;
    }

    public int getLength (){
        return Test.length;
    }

    @Override
    public void add(int val) {
        int length = Test.length;
        int c = val;
        for( int i= 0; i<length;i++){
            if (i<=length){
                Test[i]=c;
            }else{
                int newLength = length*2;
                int[] newArr = new int[newLength];
                newArr [i] = c;
                System.arraycopy(Test, 0, newArr, length, newLength);

                // set newArr = Test
                }
        }

    }
    @Override
    public int get(int id) {
        return Test[id];

    }
}
