package dev.fabiosimones.santander_dev.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_feature")
public class Feature extends BaseItem{

    public Feature(){}

    public Feature(Long id, String icon, String description) {
        super(id, icon, description);
    }

}
