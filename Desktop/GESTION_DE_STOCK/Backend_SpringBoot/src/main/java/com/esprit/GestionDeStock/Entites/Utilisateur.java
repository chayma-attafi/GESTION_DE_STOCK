/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.GestionDeStock.Entites;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity  {
    
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "email")
    private String email;

    @Column(name = "datenaissance")
    private Instant dateNaissance;
    
    @Column(name = "motdepasse")
    private String motdepasse;
    
    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;
        
}
