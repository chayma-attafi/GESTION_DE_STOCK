/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author chayma2
 */
public class MagasinTest {
    public static void main (String[] args)
    {
        ProduitAlimentaire produit1 = new ProduitAlimentaire();
        ProduitAlimentaire produit2 = new ProduitAlimentaire(1021, "Lait", "Delice");
        ProduitAlimentaire produit3 = new ProduitAlimentaire(2510, "yaourt", "Vitalait");
        ProduitAlimentaire produit4 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
        
        produit2.affecterPrix(0.7f);
        
        Magasin m = new Magasin(1234,"Tunis");
        m.ajouterProduit(produit1);
        m.ajouterProduit(produit2);
        m.ajouterProduit(produit3);
        m.ajouterProduit(produit4);

        System.out.println(m.toString());
        System.out.println("Total des Produits  " + m.getTotalProduit() );
        System.out.println("Prix totale " + m.calcul_Prix());
        
    }   
}
