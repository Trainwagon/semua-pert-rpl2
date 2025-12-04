/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert2_rpl_la;

/**
 *
 * @author Advan
 */
public class Pert2_rpl_la {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom", 2, "Putih");
        Anjing anjing1 = new Anjing("Spike", 3, "Golden Retriever");
        
        kucing1.info();
        anjing1.info();
        
        System.out.println();
        
        kucing1.bersuara();
        anjing1.bersuara();
        
        System.out.println();
        
    }
}
