package com.esprit.GestionDeStock.repository;

import com.esprit.GestionDeStock.Entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
