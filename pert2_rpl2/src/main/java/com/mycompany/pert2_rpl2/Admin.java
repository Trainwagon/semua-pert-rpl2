/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl2;

/**
 *
 * @author Advan
 */
public class Admin extends User {
    public void login(){
        System.out.println("Admin melakukan login");
    }
    
    public void logout(){
        System.out.println("Admin melakukan logout");
    }
    
    public void managerUser(){
        System.out.println("Admin mengelola user!");
    }
}
