/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author R A M A D H A N
 */
class luas {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int luas;
    
    public void luas(){
        Scanner input=new Scanner(System.in);
        System.out.println("Panjang persegi Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Lebar persegi panjang : " );
        int lebar = input.nextInt();
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang : "+ luas);
    }
}
