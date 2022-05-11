package tacos.Repository;

import org.springframework.data.repository.CrudRepository;
import tacos.Module.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
