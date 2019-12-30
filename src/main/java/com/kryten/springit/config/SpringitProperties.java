package com.kryten.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is our welcome message
     */

    private String welcome_message = "Hello World! This is the default message";

    public String getWelcomeMessage() {
        return welcome_message;
    }

    public void setWelcomeMessage(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
