/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.syahrundalu.latihanmvc.controller;

import edu.syahrundalu.latihanmvc.model.pelangganModel;
import edu.syahrundalu.latihanmvc.view.pelangganView;
import javax.swing.JOptionPane;

/**
 *
 * NAMA  : MUHAMMAD SYAHRUN DALU
 * NIM   : 10116584
 * KELAS : IF-Ulang
 */
public class pelangganController {
    
    private pelangganModel model;

    public void setModel(pelangganModel model) {
        this.model = model;
    }
    
       
    public void resetForm(pelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")){
            
        } else {
            model.resetForm();
        }
                
          
    }
    
    public void simpanForm(pelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Email Masih Kosong");
        } else if (noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
        
    }
    
}
