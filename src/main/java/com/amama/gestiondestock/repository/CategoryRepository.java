package com.amama.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amama.gestiondestock.model.Category;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
Category findByCode(String code);
}
