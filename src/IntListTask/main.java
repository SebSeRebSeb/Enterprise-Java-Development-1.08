package IntListTask;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        IntVector Test = new IntVector();
        IntArrayList Num = new IntArrayList();
        Test.add(2);
        Test.add(4);
        Test.add(3);
        Test.add(4);
        Test.add(6);
        System.out.println(Test.get(5));
        Num.add(5);
        Num.add(1);
        System.out.println(Num.get(0));

    }
}
