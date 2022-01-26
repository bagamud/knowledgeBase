package peter.ic.knowledgebase.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class InformationSystem {

    int id;
    @Id
    private String name;
    private String title;
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<AnalyticalReport> analyticalReports;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<AnalyticalReport> getAnalyticalReports() {
        return analyticalReports;
    }

    public void setAnalyticalReports(Set<AnalyticalReport> analyticalReports) {
        this.analyticalReports = analyticalReports;
    }
}
