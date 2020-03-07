/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.pkg1d1;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT31D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int amax = -999999999;
    int amin = 999999999;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 10 so: ");
        for(int i=0;i<10;i++)
        {
            int a = sc.nextInt();
            amax = max(amax,a);
            amin = min(amin,a);
        }
        System.out.println("So lon nhat: " +amax);
        System.out.println("So nho nhat: " +amin);
    }
    
}
