package org.example;

public class ConfigurationValidator {
    public boolean validateConfiguration(Config config) {
        if(!checkConfig(config)) {
            return false;
        }
        var userResult = checkUsername(config);
        var passwordResult = checkPassword(config);
        var urlResult = checkUrl(config);
        return userResult && passwordResult && urlResult;
    }

    private boolean checkConfig(Config config) {

        if (config == null) {
            System.out.println("Config object cannot be null");
            return false;
        }
        return true;

    }

    private boolean checkUsername(Config config) {
        if (config.getUsername().isEmpty()) {
            System.out.println("Username cannot be empty");
            return false;
        } else if (config.getUsername() == null) {
            System.out.println("Username cannot be null");
            return false;
        }
        return true;

    }

    private boolean checkPassword(Config config) {
        if (config.getPassword().isEmpty()) {
            System.out.println("Password cannot be empty");
            return false;
        } else if (config.getPassword() == null) {
            System.out.println("Password cannot be null");
            return false;
        }
        return true;


    }

    private boolean checkUrl(Config config) {
        if (!config.getUrl().startsWith("http")) {
            System.out.println("Invalid URL: must start with http");
            return false;
        } else if (config.getUrl().isEmpty()) {
            System.out.println("URL cannot be empty");
            return false;
        } else if (config.getUrl() == null) {
            System.out.println("URL cannot be null");
            return false;
        }
        return true;

    }


}
