package com.digitalinnovationone.ControlAccessLive.Repository;

import com.digitalinnovationone.ControlAccessLive.modelo.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
