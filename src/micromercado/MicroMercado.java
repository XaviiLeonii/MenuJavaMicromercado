/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micromercado;


/**
 *
 * @author Javier Leoni
 */

import javax.swing.JOptionPane;

public class MicroMercado {

    
    public static void main(String[] args) {
        
        int cat = 0;
        double precio = 0;
        double subtotal = 0;
        double descuento = 0;
        double Total = 0;
        double cambio = 0;
        int cantidad = 0;
        int fila = 0;
        int s= Integer.parseInt(JOptionPane.showInputDialog(null,"1.-SI TE "
                + "GUSTARIA ADQUIRIR MAS DE UN PRODUCTO TECLEA 2 \n"
                + "2.-SI ESTE ES TU UNICO PRODUCTO QUE VAS A COMPRAR TECLEA 1"));
    
    
        String categoria[]={"1. Bebidas", "2. Frituras", "3. Detergente", "4. Lacteos", "5. Cereales"};
        
        String Bebidas [][]={
        
            {"1.600ml", "2. 1litro", "3. 1.5litros", "4. 2litros", "5. 3litros"},
            {"8", "12", "15","18", "22"},};
        
        String Frituras [][]={
        
            {"1. pequeñas", "2. medianas", "3. grandes"},
            {"5", "10", "20"},
        };
        
        String Detergente[][]={
        
            {"1. 500g", "2. 1kg", "3. 2kg", "4. 5kg", "5. 20kg"},
            {"8", "12", "16", "30", "50"},
        };
        
        String Cereales [][]={
        
            {"1. pequeños", "2. medianos", "3. grande"},
            {"4", "10", "35"},
            
        };
        
        
        
        
        String articulo ="";
        
        
    
    }
    
}
