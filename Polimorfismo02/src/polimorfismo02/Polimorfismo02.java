/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author Luciano Martinez
 */
public class Polimorfismo02 {// polimorfismo de sobrecarga

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("hello world! ");
        
        
        
        Cachorro c = new Cachorro();
        
        c.reagir("Comida");
        c.reagir(false);
        c.reagir(2, 3.2f);
        c.reagir(22, 10);
        
    }
    
}
