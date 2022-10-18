/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package  PRAK201_2110817320001_LidyaRahmi;

/**
 *
 * @author LIDYA RAHMI
 */
public class Soal1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //inisialisasi objek//
        // TODO code application logic here
            buah arumanis = new buah("Arumanis", 0.3f, 13, 3.9f, 5000);  //menambahkan data arumanis//
            buah manalagi = new buah("Manalagi", 0.5f, 17, 8.5f, 7500); //menambahkan data manalagi//
            buah manggamadu = new buah("Mangga Madu", 0.375f, 12, 4.5f, 6500); //menambahkan data manggamadu//
  
           arumanis.displayStatus(); //akses method//
           System.out.println("");
           manalagi.displayStatus();
           System.out.println("");
           manggamadu.displayStatus();
           System.out.println("");
                       
            
    }
    
}
