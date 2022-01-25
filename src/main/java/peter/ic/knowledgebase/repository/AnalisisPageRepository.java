package peter.ic.knowledgebase.repository;

import org.springframework.data.repository.CrudRepository;
import peter.ic.knowledgebase.entity.AnalisisPage;

import java.util.List;

public interface AnalisisPageRepository extends CrudRepository<AnalisisPage, Integer> {
    List<AnalisisPage> findAllByInformationSystem(String informationSystem);
}
