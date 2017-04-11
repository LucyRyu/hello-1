package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExampleTest {

    public static void main(String[] args) {
        ClassMemberExample cme = new ClassMemberExample();

        int b = ClassMemberExample.getStaticTest();

        int a = ClassMemberExample.CLASS_MEMBER;

        //System.out.println(b);

        int r = (int)(Math.random() * 6 + 1);
        System.out.println(r);
    }
}
