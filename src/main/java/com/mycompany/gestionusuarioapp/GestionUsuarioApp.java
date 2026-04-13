/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionusuarioapp;

import com.adso39.vistas.PantallaPrincipal;

/**
 *
 * @author SENA
 */
public class GestionUsuarioApp {


    public static void main(String[] args) {
        try {
                    PantallaPrincipal pantallaPrincipal = 
                        new PantallaPrincipal();
                
                pantallaPrincipal.setLocationRelativeTo(null);
                pantallaPrincipal.setVisible(true);
         
          }    
        catch(Exception e){
            System.out.print(e.getMessage());
            }
        }
        
}
