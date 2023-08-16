/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author chayma2
 */
public class Magasin {
    int identifiant;
    String adresse;
    int capacite;
    ProduitAlimentaire tab[]; // autrement on peut l'initilialiser ici ProduitAlimentaire = new ProduitAlimentaire[50]
    
    public Magasin(int identifiant, String adresse) 
    {
    this.identifiant = identifiant;
    this.adresse = adresse;
    this.tab = new ProduitAlimentaire[50] ; //initialisation d'un tableau
    }
    

    
    public void ajouterProduit(ProduitAlimentaire produit )
    {
        this.tab[capacite] = produit;
        this.capacite ++ ;
    }
    
     public String toString(){
        String s ="";
        
        s+= "identifiant : "+ this.identifiant +" \n";
        s+= "adresse : "+ this.adresse +" \n";
        s+= "capacite : "+ this.capacite +" \n";
       
        String prods = "";
        for ( int i=0; i<this.capacite;i++){ //or taille du tableau :tab.length
            prods+=this.tab[i];
        }
        
        return s+prods;
    }
        
    public int getTotalProduit(){
        return this.capacite;
    }
    


    public float calcul_Prix(){
        float s=0;
        for ( int i=0; i<this.capacite;i++)
        { s+=tab[i].getPrix();}
        return s;
    }
    
}
