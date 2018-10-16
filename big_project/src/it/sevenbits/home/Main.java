package it.sevenbits.home;

public class Main {

    public static void main(String[] args) {
        String pattern = "([a-z,(,)]+ \\{) |([a-z,(,)]+;|})";

        Formatter formatter = new Formatter(pattern);
        String test1 = formatter.format("aaa() { bbbb; aaa(args) { bbbb; ccc;} ccc;}");
        System.out.println(test1);

        formatter = new Formatter(pattern);
        String test2 = formatter.format("aaa { bbbb; ccc;}");
        System.out.println(test2);
    }
}
