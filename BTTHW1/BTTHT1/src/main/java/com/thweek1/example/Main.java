package com.thweek1.example;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
        } else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        }
    }
}
