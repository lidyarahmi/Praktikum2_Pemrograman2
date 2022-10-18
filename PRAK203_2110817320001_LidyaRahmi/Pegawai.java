/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  PRAK203_2110817320001_LidyaRahmi;

/**
 *
 * @author LIDYA RAHMI
 */
public class Pegawai {
    public String nama;
    public String asal; /* pada class pegawai terdapat kesalahan tipe data di variabel asal, dimana pada variabel tersebut
menggunakan tipe data char yang dimana tipe data char bisa digunakan untuk satu karakter saja, dan
digantikan oleh tipe data String
*/
    public String jabatan;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){ //tipe data diganti mulai dari char ke string (change method char)//
        return asal;
    }
    
    public void setJabatan(String j){
        this.jabatan= j; //mendeklarasikan variabel jabatan dengan mengganti nama menjadi j//
    }
     
}



