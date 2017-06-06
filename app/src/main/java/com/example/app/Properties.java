package com.example.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by lucas.augusto on 15/05/17.
 */
@ConfigurationProperties(prefix = "app")
public class Properties {

    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(final List<String> names) {
        this.names = names;
    }
}
