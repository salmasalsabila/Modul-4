/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphism;

/**
 *
 * @author lenovo
 */
class kucing extends hewan {
    
    @Override
    void setNama(){
        String kucing = "Carbereus";
        System.out.println("Nama Kucing: "+kucing);
    }
    @Override
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing: "+suara);
    }
    @Override
    void setBerat(){
        double berat = 2.0;
        System.out.println("berat Kucing: "+berat+"Kg");
    }  
}
