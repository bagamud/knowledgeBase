package peter.ic.knowledgebase.repository;

import org.springframework.data.repository.CrudRepository;
import peter.ic.knowledgebase.entity.InformationSystem;

public interface InformationSystemRepository extends CrudRepository<InformationSystem, String> {
}
