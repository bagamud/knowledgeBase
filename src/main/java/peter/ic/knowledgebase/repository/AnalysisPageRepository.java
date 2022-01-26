package peter.ic.knowledgebase.repository;

import org.springframework.data.repository.CrudRepository;
import peter.ic.knowledgebase.entity.AnalyticalReport;
import peter.ic.knowledgebase.entity.InformationSystem;

import java.util.List;
import java.util.Set;

public interface AnalysisPageRepository extends CrudRepository<AnalyticalReport, Integer> {
    AnalyticalReport findByName(String name);
}
