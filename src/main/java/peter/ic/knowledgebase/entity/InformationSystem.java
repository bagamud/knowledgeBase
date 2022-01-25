package peter.ic.knowledgebase.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InformationSystem {

    @Id
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
