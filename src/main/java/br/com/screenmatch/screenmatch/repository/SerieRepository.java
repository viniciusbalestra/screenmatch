package br.com.screenmatch.screenmatch.repository;

import br.com.screenmatch.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository recebe como parâmetro o objeto que estou trabalhando e o tipo do Id
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
