/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.principal;

import com.epn.entidades.Producto;
import com.epn.entidades.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class main {


    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("Laboratorio1");
        
        // llamar a la clase controladora para acceder a los metodos CRUD
        
        ProductoJpaController pjc = new ProductoJpaController(enf);
        
        Producto p = new Producto();
        p.setNombre("mantequilla");
        p.setPrecio(BigDecimal.valueOf(2.65));
        
        pjc.create(p);
        
    }
    
}
