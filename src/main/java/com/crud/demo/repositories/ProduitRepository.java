package com.crud.demo.repositories;

import com.crud.demo.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    Produit findByDesignation(String designation);
}
