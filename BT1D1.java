/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT1D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao x: ");
        x = sc.nextInt();
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println("Uoc so cua x la: " + i);
            }
        }
    }

}
