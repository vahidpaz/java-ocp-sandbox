package org.ocp.imports;

// This import would cause an error: we won't be able to define a class named Number
// since it will already be a defined entity in our scope (java.lang.Number would win).
//import java.lang.Number;

// It's okay to use a class name of something found in package java.lang.
public class Number {
    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.Number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for org.ocp.imports.Number");
    }

    public static void main(String[] args) {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }
}
