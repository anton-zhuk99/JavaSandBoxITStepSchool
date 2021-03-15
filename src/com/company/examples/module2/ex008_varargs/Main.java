package com.company.examples.module2.ex008_varargs;

public class Main {

    private static void listArguments(String ... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }

    private static void listArguments(int ... args) { // ()
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }

    private static void listArguments2(String simpleArgument1, String simpleArgument2, String ... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }

    public static void main(String[] args) {
        listArguments2("firstArg", "firstArg", "first", "second", "thrid");
        listArguments(1, 2, 3);
    }

}
