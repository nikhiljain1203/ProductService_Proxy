package com.example.productservice_proxy;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public int cbrt(int a) {
        return (int) Math.cbrt(a);
    }

    public int log(int a) {
        return (int) Math.log(a);
    }

    public int log10(int a) {
        return (int) Math.log10(a);
    }
}
