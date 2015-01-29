/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.junit.Test;

/**
 *
 * @author pablo
 */
public class Prueva_Nuñez {
 @ Test   
public String leerTxt(){
    String direccion="C:\\Users\\pablo\\Desktop\\juego.tx";
    String texto ="";
       
    try {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String temp ="";
        String bfRead;
        while((bfRead = bf.readLine()) != null){
            temp = temp + bfRead;
        }
        texto=temp;
    } catch (IOException e) {
        System.err.println("No se encontro archivo");
        
    }
    return texto;
}
}
