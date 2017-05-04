package de.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by 1 on 18/04/2017.
 */
@Document
public class StackoverflowWebsite {
    @Id
    private final String id;
    private final String iconImageUrl;
    private final String website;
    private final String description;

    public StackoverflowWebsite(String id, String iconImageUrl, String website, String description) {
        this.id = id;
        this.iconImageUrl = iconImageUrl;
        this.website = website;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }
}

