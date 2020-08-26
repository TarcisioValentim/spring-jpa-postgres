package com.calaca.exemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoDao extends JpaRepository<Veiculo, Integer>{

}
