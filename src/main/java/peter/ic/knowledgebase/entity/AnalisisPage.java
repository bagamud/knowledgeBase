package peter.ic.knowledgebase.entity;

import javax.persistence.*;

@Entity
public class AnalisisPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "VARCHAR")
    private String informationSystem;

    @Column(columnDefinition = "VARCHAR")
    private String reportName;

    @Column(columnDefinition = "VARCHAR")
    private String algorithm;

    @Column(columnDefinition = "VARCHAR")
    private String selectQuery;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInformationSystem() {
        return informationSystem;
    }

    public void setInformationSystem(String informationSystem) {
        this.informationSystem = informationSystem;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getSelectQuery() {
        return selectQuery;
    }

    public void setSelectQuery(String selectQuery) {
        this.selectQuery = selectQuery;
    }
}
