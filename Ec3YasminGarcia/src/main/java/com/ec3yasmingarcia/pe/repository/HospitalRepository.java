package com.ec3yasmingarcia.pe.repository;

import com.ec3yasmingarcia.pe.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
