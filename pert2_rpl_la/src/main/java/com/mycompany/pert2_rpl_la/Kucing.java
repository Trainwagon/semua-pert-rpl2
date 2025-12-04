/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl_la;

/**
 *
 * @author Advan
 */
public class Kucing extends Hewan{
    private String warnaBulu;
    
    public Kucing(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Meong!");
    }
    
    public void info() {
        System.out.println("Kucing: " + getNama() + ", Umur: " + getUmur() + ", Warna: " + warnaBulu);
    }
}
