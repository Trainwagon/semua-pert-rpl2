package com.mycompany.pert2_rpl2;
public class Student {
    private String name; // atribut disembunyikan

    // setter untuk mengatur nilai name
    public void setName(String name) {
        this.name = name;
    }

    // getter untuk mengambil nilai name
    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Pangeran");
        System.out.println(s.getName());
    }
}