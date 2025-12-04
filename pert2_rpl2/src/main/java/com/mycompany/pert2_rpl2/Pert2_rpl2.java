/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert2_rpl2;

/**
 *
 * @author Advan
 */
public class Pert2_rpl2 {

    public static void main(String[] args) {
        Student s = new Student();

        User user = new User();
        Seller seller = new Seller();
        Buyer buyer = new Buyer();
        Admin admin = new Admin();
        
        user.login();
        user.logout();
        
        seller.addProduct("Nasi goreng");
        
        buyer.login();
        buyer.logout();
        
        admin.login();
        admin.managerUser();
        admin.logout();
        
        s.setName("Pangeran");
        System.out.println(s.getName());
    }
}
