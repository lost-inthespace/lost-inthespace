package org.example;

public class Main {
    public static void main(String[] args) {
        /* char x = 'a';
        char w = (char) (x + 20);
        System.out.print(w);

        int x =2;
        int ww = x++ * 3;
        System.out.print(x);
         */
        String s1=  "abc";
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.print(s1.equalsIgnoreCase(s2));
        System.out.println(s1 == s2.intern());
        System.out.println(s1 == s2);
    }
}