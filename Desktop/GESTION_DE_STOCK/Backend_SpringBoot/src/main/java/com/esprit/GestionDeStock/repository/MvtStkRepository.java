package com.esprit.GestionDeStock.repository;

import com.esprit.GestionDeStock.Entites.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<MvtStk,Integer> {
}
