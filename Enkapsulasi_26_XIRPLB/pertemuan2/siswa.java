/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author R A M A D H A N
 */
public class siswa {
    private String nama;
    private String alamat;
    private int kelas;
    
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String setalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public int getkelas(){
        return kelas;
    }
    public void setkelas(int kelas){
        this.kelas=kelas;
    }
    public void cetak(){
        System.out.println("Nama = "+ nama);
        System.out.println("Alamat "+ alamat);
        System.out.println("Kelas "+ kelas);
    }
    public static void main (String []args){
        siswa kb=new siswa();
        kb.setnama("Dilan Cepmek");
        kb.setalamat("Bandung");
        kb.setkelas(12);
        kb.cetak();
    }
}
