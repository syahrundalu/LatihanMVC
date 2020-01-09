/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.syahrundalu.latihanmvc.model;

import edu.syahrundalu.latihanmvc.event.pelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * NAMA  : MUHAMMAD SYAHRUN DALU
 * NIM   : 10116584
 * KELAS : IF-Ulang
 */
public class pelangganModel {
    
    private String nama;
    private String email;
    private String noTlp;

    private pelangganListener pelangganListener;

    public pelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(pelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    
    
        
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnCHange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnCHange();
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
        fireOnCHange();
    }
    
    protected void fireOnCHange(){
        if (pelangganListener != null){
            pelangganListener.onChange(this);
        }
        
        
    }
    
    public void resetForm(){
        
        setNama("");
        setEmail("");
        setNoTlp("");
    }
    
    public void simpanForm(){
        
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
        
    }
    
    
}
