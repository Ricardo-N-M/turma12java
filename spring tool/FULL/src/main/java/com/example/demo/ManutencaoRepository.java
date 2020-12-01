package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//conduz os dados da tabela ao banco, serve para persistir 
//os dados no banco (insert, delete, etc)
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

}
