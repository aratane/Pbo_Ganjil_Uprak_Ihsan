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
public class Kendaraan {
    String Merk, Jenis_Kendaraan, Nm_STNK, No_STNK;
        int Nopol, Kd_Pemilik, Tgl_Daftar;
        
        void DataKendaraan(){
            System.out.println("=====================================================");
            System.out.println("Nopol : "+Nopol);
            System.out.println("Merk : "+Merk);
            System.out.println("Jenis Kendaraan : "+Jenis_Kendaraan);
            System.out.println("Tanggal Daftar : "+Tgl_Daftar);
            System.out.println("Kode Pemilik : "+Kd_Pemilik);
            System.out.println("Nama STNK : "+Nm_STNK);
            System.out.println("Nomor STNK : "+No_STNK);
            System.out.println("=====================================================");
        }
}
