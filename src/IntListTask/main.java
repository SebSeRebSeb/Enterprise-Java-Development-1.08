package IntListTask;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        IntVector Test = new IntVector();
        IntArrayList array = new IntArrayList();
        Test.add(2);
        Test.add(4);
        Test.add(3);
        Test.add(4);
        Test.add(6);
        System.out.println(Test.get(5));

        for(int i = 0; i<20; i++) {
            array.add(i);
            System.out.println(array.get(i));
        }



    }
}
