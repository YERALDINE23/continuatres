package com.ec3yasmingarcia.pe.repository;


import com.ec3yasmingarcia.pe.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
