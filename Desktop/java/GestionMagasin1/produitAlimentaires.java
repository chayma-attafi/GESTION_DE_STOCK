import java.io.*;
import java.util.Date;

public class produitAlimentaires {
    
    int id;
    String libelle;
    String marque;
    float prix;
    Date dateExpriration;
    
    public produitAlimentaires () {}
    
    public produitAlimentaires (int ident, String lib, String marq) {
        this.id=ident;
        this.libelle=lib;
        this.marque=marq;
    }

     public produitAlimentaires (int ident, String lib, String marq, float p) {
       // this.id=ident;
       // this.libelle=lib;
       // this.marque=marq;
       // this.prix = p;
        this(ident,lib,marq);
        this.prix=p;
    }
         public void afficher() {
         //System.out.println("id est\t"+ id + "libelee est\t" + libelle + "marque est\t" + marque + "prix est\t" + prix);
         System.out.printf("id = %d libelle = %s marque = %s prix= %.3f %n",id,libelle,marque,prix);
    }

    


     
        public String toString(){

        return  "id est\t"+ id + "libelee est\t" + libelle + "marque est\t" + marque + "prix est\t" + prix; }
         
        public void affecterDateExpiration(Date date){
        this.dateExpriration = date; }
    

    

     
}