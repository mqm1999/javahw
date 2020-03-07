/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT3D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, min, max;
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            int x = i + 1;
            System.out.println("Nhap vao phan tu thu " + x + ": ");
            a[i] = sc.nextInt();
        }
        max = a[0];
        min = a[0];
        for (i = 0; i < 10; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
    }

}
