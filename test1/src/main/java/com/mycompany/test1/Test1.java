/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        System.out.println("Triangle type: " + triangleType(side1, side2, side3));
    }

    public static String triangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return "NotATriangle";
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c) {
            if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b)
                return "RightTriangle";
            else
                return "Isosceles";
        } else if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b)
            return "RightTriangle";
        else
            return "Scalene";
    }
}

