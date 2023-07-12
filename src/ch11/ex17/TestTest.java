package ch11.ex17;

import java.io.IOException;

public class TestTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            method4();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void method1() throws ExceptionA {
        throw new ExceptionA();
    }

    public static void method2() throws ExceptionB {
        throw new ExceptionB();
    }

    public static void method3() throws NullPointerException {
        throw new NullPointerException();
    }

    public static void method4() throws IOException {
        throw new IOException();
    }
}
