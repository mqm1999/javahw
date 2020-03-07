/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4d1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT4D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, i;
        Scanner sc = new Scanner(System.in);
        while (true) {
            Random rd = new Random();
            System.out.println("Moi ban doan so: ");
            x = rd.nextInt();
            i = sc.nextInt();
            if (i != x) {
                if (i > x) {
                    System.out.println("Qua cao, moi doan lai");
                } else {
                    System.out.println("Qua thap, moi doan lai");
                }
            } else {
                System.out.println("Ban da doan dung");
                break;
            }
        }
    }
}
