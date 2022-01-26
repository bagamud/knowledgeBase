package peter.ic.knowledgebase.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AnalyticalReport {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Id
    private String name;

    private String title;

    @Column(columnDefinition = "VARCHAR")
    private String description;

    @Column(columnDefinition = "VARCHAR")
    private String goal;


    @Column(columnDefinition = "VARCHAR")
    private String algorithm;

    @Column(columnDefinition = "VARCHAR")
    private String filter;

    @Column(columnDefinition = "VARCHAR")
    private String selectQuery;

    @Column(columnDefinition = "VARCHAR")
    private String updateFrequency;

    @Column(columnDefinition = "VARCHAR")
    private String notes;


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

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
