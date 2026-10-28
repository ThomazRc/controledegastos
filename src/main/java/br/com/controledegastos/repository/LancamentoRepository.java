package br.com.controledegastos.repository;

import br.com.controledegastos.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}