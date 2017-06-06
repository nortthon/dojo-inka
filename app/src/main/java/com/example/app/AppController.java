package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by lucas.augusto on 15/05/17.
 */
@RestController
@EnableConfigurationProperties(Properties.class)
public class AppController {

    private Properties properties;

    @Autowired
    public AppController(final Properties properties) {
        this.properties = properties;
    }

    @GetMapping("/names")
    public Collection<String> getNames() {
        return properties.getNames();
    }
}
