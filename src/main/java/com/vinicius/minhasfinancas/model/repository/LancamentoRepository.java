package com.vinicius.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
