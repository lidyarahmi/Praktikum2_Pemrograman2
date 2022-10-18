/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  PRAK202_2110817320001_LidyaRahmi;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author LIDYA RAHMI
 */
public class Mobil {
    DecimalFormat koma = (DecimalFormat) DecimalFormat.getCurrencyInstance();  //untuk menampilkan angka desimal ke currency//
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
      String merek; //membuat variabel dan tipe data sesuai dengan soal yang ditentukan//
      int harga;
      String tahun_keluaran;
      int kapasitas;
      private  String pemilik;
      private int pajak;
  
     public void setPemilik(String pemilik){  ///Method tidak pengembalian  nilai//
         this.pemilik = pemilik;
     }
   
     public String getPemilik(){ ///Method pengembalian nilai ke pemilik//
         return pemilik;
     }
     
     public int getPajak(){  //Method pengembalian nilai ke pajak//
         pajak= (int) (harga*2/100);
         return pajak;
     }
  
    public void info(){
        formatRp.setCurrencySymbol("");
        formatRp.setMonetaryDecimalSeparator(','); //untuk menampilkan nilai rupiah keluar output seperti koma//
        koma.setDecimalFormatSymbols(formatRp);
        System.out.println("Merek Mobil : " +merek);
        System.out.println("Harga : Rp. "+koma.format(harga));
        System.out.println("Tahun keluaran : " +tahun_keluaran+ " ");
        System.out.println("Kapasitas:  "+kapasitas+"cc");
   
    }
    
      
}

      


