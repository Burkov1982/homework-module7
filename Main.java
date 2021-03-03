package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle();
        CheckType checkType = new CheckType();
        System.out.println(checkType.typeChecker(shape));
    }
}
