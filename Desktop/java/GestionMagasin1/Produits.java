public class Produits {
    
    public static void main (String  args[]) {
        produitAlimentaires produit1 = new produitAlimentaires(); //produit1 : objet
        produitAlimentaires produit2 = new produitAlimentaires(1021,"Lait","Delice");
        produitAlimentaires produit3 = new produitAlimentaires (2510,"yaourt","Vitalait");
        produitAlimentaires produit4 = new produitAlimentaires(3250,"Tomate","Sicam",1.200f);
        
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