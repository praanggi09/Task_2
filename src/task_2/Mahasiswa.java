/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author praanggi
 */
public class Mahasiswa {
    String NIM;
    String Nama;
    String Status;
    char Nilai [];
    int i;

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setNilai(char[] Nilai) {
        this.Nilai = Nilai;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getStatus() {
        return Status;
    }

    public char[] getNilai() {
        return Nilai;
    }

    public int getI() {
        return i;
    }

    public Mahasiswa() {
        Status = "Tidak Lulus";
        i = 0;
        Nilai = new char[10];
    }

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        
        Status = "Tidak Lulus";
        i = 0;
        
        Nilai = new char[10];
    }
    
    public void addNilai (char Nilai){
        if (i < 10){
            i++;
            this.Nilai [i] = Nilai;
        }
    }
    
    public char getNilai (int i){
        return Nilai [i+1];
    }
    
    public String toString (){
        String y = NIM + "," +Nama+ "," +Status+ "," + "Nilai = ";
        for (int m = 0; m <= i; m++){
            y = y + Nilai[m] + ",";
        }
        return y;
    }
    
    public char cekNilai (Mahasiswa m){
        char p = 0;
        for (char q = 'A'; q< 'E'; q++){
            for (int r = 0; r < i; r++){
                if (Nilai[r] == q){
                    for (int s = 0; s < m.i; s++){
                        if (m.Nilai[s] == q) {
                            return q;
                        }
                    }
                }
            }
        }
    return p;
    }
}

