package homework.persistence.dao.repositories;

import homework.persistence.model.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CounterRepository extends CrudRepository<Counter, Long> {

}
