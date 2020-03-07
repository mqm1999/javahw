/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2d1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT2D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, count = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao x: ");
        x = sc.nextInt();
        if (x < 2) {
            System.out.println("False");
        } else {
            for (i = 2; i <= sqrt(x); i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

}
