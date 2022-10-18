/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  PRAK201_2110817320001_LidyaRahmi;

/**
 *
 * @author LIDYA RAHMI
 */
public class buah {
    String nama_mangga;  //membuat variabel dan tipe data sesuai dengan soal yang ditentukan//
    String warna;
    String rasa;
    String tekstur;
    float berat;
    int jumlah_beli;
    float total_berat;
    int total_harga;
    int harga;
    
    //Enkapsulasi //

    /**
     *
     * @param m
     * @param berat
     * @param jl
     * @param tb
     * @param h
     */
    public buah(String m, float berat, int jl, float tb, int h){ //membuat objek//
         nama_mangga = m;
         this.berat = berat;
         jumlah_beli = jl;
         total_berat= tb; 
         harga=h; 
    }
    
    public int total_harga(){ //Method pengembalian nilai ke total_harga//
        total_harga = jumlah_beli * harga;
        return total_harga; //behavior//
    }
    
    public float total_berat(){ 
       this.total_berat = jumlah_beli * berat;
        return  total_berat;  //behavior//
    }

    //Method//
     public void displayStatus(){ 
        System.out.println("Nama Mangga : " +nama_mangga); //menampilkan variabel nama_mangga (behavior)//
        System.out.println("Berat : "  +berat+ "kg"); //menampilkan variabel berat (behavior)//
        System.out.println("Jumlah Beli : " +jumlah_beli); //menampilkan variabel jumlah_data (behavior)//
        System.out.println("Total berat :  "+total_berat+ "kg"); //menampilkan variabel total_berat (behavior)//
        System.out.println("Total harga : Rp." +total_harga()); //menampilkan variabel total_harga (behavior)//
   
    }
       
}
