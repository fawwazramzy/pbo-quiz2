/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faw.jFrame;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iloops
 */
public class Transaksi {
    //atribut
    private double subTotal = 0;
    private double detailBarang;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public double countsubTotal(){
        subTotal = 0;
        for(int i = 0; i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 1).toString());
        }
        return subTotal;
    }
    //method output hasil
    public String detailBarang(){
        String detailBarang ="";
        for (int i = 0; i < tabel.getRowCount(); i++) {
            detailBarang += tabel.getValueAt(i, 0);
            
        }
        return detailBarang;  
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDetailBarang() {
        return detailBarang;
    }

    public void setDetailBarang(double detailBarang) {
        this.detailBarang = detailBarang;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
}

