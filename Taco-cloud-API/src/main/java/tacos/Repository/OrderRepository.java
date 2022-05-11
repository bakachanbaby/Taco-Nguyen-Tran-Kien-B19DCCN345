package tacos.Repository;

import org.springframework.data.repository.CrudRepository;
import tacos.Module.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
