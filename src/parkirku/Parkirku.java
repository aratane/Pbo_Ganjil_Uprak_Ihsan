/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkirku;

/**
 *
 * @author PC - 20
 */
public class Parkirku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pemilik pmlk = new Pemilik();
        pmlk.DataPemilik();
        
        Petugas ptgs = new Petugas();
        ptgs.DataPetugas();
        
        Kendaraan kndr = new Kendaraan();
        kndr.DataKendaraan();
        
        Daftar dftr = new Daftar();
        dftr.DataDaftar();
    }
    
}
