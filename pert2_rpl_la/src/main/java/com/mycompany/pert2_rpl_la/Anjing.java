/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl_la;

/**
 *
 * @author Advan
 */
public class Anjing extends Hewan{
    private String ras;
    
    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Guk guk!");
    }
    
    public void info() {
        System.out.println("Anjing: " + getNama() + ", Umur: " + getUmur() + ", Ras: " + ras);
    }
}
