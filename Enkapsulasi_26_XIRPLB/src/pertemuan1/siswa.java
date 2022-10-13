/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author R A M A D H A N
 */
public class siswa {
        private String nama;
        private int nilai = 0;
        private String kelas;
        private int absen;
        private String jenisKl;
        
        public void isiData(){
             nama = "Steven";
             absen = 26;
             kelas = "XI RPL B";
             jenisKl = "Laki-Laki";
             nilai = 95;
}
        public void cetak(){
            System.out.println("Nama      : "+ nama);
            System.out.println("Absen     : "+ absen);
            System.out.println("Kelas     : "+ kelas);
            System.out.println("Nilai     : "+ jenisKl);
            System.out.println("Nilai     : "+ nilai);
    }
}
