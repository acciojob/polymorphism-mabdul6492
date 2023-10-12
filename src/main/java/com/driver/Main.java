package com.driver;
class Product {
    public int product(int x, int y) {
        return x*y;
    }

    public int product(int x, int y, int z) {
        return x*y*z;
    }

    public double product(double x, double y) {
        return x*y;
    }
    
}

public class Main {


    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(5, 10));
        System.out.println(p.product(5, 10, 15));
        System.out.println(p.product(5.1, 10));
    }

}