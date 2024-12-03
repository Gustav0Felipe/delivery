package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
