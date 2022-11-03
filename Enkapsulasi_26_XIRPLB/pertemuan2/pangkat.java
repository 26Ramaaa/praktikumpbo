/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import javax.swing.JOptionPane;
/**
 *
 * @author R A M A D H A N
 */
public class pangkat {
    private int angka;
    private int hasil;
    
    public int getangka (){
        return angka;
    }
    public void setangka(int angka){
        this.angka=angka;
    }
    public void pangkat(){
        JOptionPane.showMessageDialog(null, "Menghitung Pangkat");
        String input1 = JOptionPane.showInputDialog("Masukan angka :");
        int nilai1 = Integer.parseInt(input1);
        hasil = nilai1 * nilai1;
        JOptionPane.showMessageDialog(null,"Pangkat 2 dari "+ nilai1 + "Adalah " + hasil);
    }
    public static void main(String[]args){
        pangkat p1 = new pangkat();
        p1.pangkat();
    }
}
