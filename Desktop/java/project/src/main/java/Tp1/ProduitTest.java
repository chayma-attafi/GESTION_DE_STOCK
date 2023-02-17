/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp1;

/**
 *
 * @author chayma2
 */
public class ProduitTest {
            public static void main (String  args[]) {
            
        ProduitAlimentaire produit1 = new ProduitAlimentaire(); //produit1 : objet
        ProduitAlimentaire produit2 = new ProduitAlimentaire(1021,"Lait","Delice");
        ProduitAlimentaire produit3 = new ProduitAlimentaire(2510,"yaourt","Vitalait");
        ProduitAlimentaire produit4 = new ProduitAlimentaire(3250,"Tomate","Sicam",1.200f);
        
        produit1.afficher();
        produit2.afficher();
        produit2.prix=0.7f;
        produit2.afficher();
        
        System.out.println(produit2.toString());
        System.out.println(produit2);
        
        //produit2.affecterDateExpiration(new Date());
        //System.out.println(produit2.dateExpriration.toString());
        
    }
    
}
