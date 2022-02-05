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
public class Pemilik {
    String Nama_Pemilik, Status, Alamat, Foto_Pemilik;
    int Kd_Pemilik, Nis_Nip, No_telp;
    
    void DataPemilik(){
        System.out.println("=====================================================");
        System.out.println("Kode Pemilik : "+Kd_Pemilik);
        System.out.println("Nama Pemilik : "+Nama_Pemilik);
        System.out.println("Status : "+Status);
        System.out.println("NIS / NIP : "+Nis_Nip);
        System.out.println("Nomor Telephone : "+No_telp);
        System.out.println("Alamat : "+Alamat);
        System.out.println("Foto Pemilik : "+Foto_Pemilik);
        System.out.println("=====================================================");
    }
}
