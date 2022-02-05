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
public class Daftar {
    String Keterangan_Daftar, Kondisi_Barang, Gambar_Kendaraan, Gambar_STNK;
        int No_Daftar, Tgl_Daftar, Nopol, Kd_Pemilik, Kd_Petugas;
        
        void DataDaftar(){
            System.out.println("=====================================================");
            System.out.println("Nomor Daftar : "+No_Daftar);
            System.out.println("Tanggal Daftar : "+Tgl_Daftar);
            System.out.println("Nopol : "+Nopol);
            System.out.println("Keterangan Daftar : "+Keterangan_Daftar);
            System.out.println("Kondisi Barang : "+Kondisi_Barang);
            System.out.println("Gambar Kendaraan : "+Gambar_Kendaraan);
            System.out.println("Gambar STNK : "+Gambar_STNK);
            System.out.println("Kode Pemilik : "+Kd_Pemilik);
            System.out.println("Kode Petugas : "+Kd_Petugas);
            System.out.println("=====================================================");
        }
}
