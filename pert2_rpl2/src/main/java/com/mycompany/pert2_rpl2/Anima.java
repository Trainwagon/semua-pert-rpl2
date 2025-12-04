/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_rpl2;

/**
 *
 * @author Advan
 */
public class Anima {
    void sound() {
        System.out.println("Make a sound");
    }
}

class Dog extends Anima {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

