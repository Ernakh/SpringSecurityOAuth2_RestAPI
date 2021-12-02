package fabricio.londero.SpringSecurityOAuth2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fabricio.londero.SpringSecurityOAuth2.Models.PessoaModel;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long>
{

}
