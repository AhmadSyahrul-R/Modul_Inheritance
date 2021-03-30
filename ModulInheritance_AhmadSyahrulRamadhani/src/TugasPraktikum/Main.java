/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek guru
        Guru pakGuru = new Guru("Pak Sumanto", "Matematika", 43, "19850723203607");
        pakGuru.info();
        
        //membuat objek murid
        Murid murid = new Murid("Ahmad Syahrul Ramadani", "X RPL 1", 01, 16, "171807001");
        murid.info();
        
        //membuat objek karyawan
        Karyawan satpam = new Karyawan("Pak Amin", "Security", 45, "19850723206532");
        satpam.info();
        
    }
    
}
