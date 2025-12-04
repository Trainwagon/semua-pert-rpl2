/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl2;

/**
 *
 * @author Advan
 */
public class Seller extends User {
    private String product;
    
    public void addProduct(String productName){
        System.out.println("Seller menggunakan product, " + productName);
        this.product = productName;
    }
}
