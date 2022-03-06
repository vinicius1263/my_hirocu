package br.com.vini.my_hirocu.repository;

import br.com.vini.my_hirocu.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
