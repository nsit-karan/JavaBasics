package org.example;

public class Exchange {


    /**
     * Does't really swap a and b - all changes local to the function
     * @param a
     * @param b
     */
    public void Swap(int a, int b) {
        int t = a;
        a = b;
        b = t;

        System.out.printf("value of a is : %d \n", a);
        System.out.printf("value of b is : %d\n", b);

    }

    /**
     * Exchanges values of a and b using a temp t
     * @param args
     */
    public static void Main(String[] args) {
        int a = 10;
        int b = 20;
        int t = a;
        a = b;
        b = t;

        System.out.printf("value of a is : %d \n", a);
        System.out.printf("value of b is : %d\n", b);
    }
}
