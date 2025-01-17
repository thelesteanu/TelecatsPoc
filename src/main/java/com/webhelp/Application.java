package com.webhelp;

import com.webhelp.ui.login.controller.MainMenuController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Application{

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        SwingUtilities.invokeLater(() -> {
            MainMenuController mainMenuController = context.getBean(MainMenuController.class);
            mainMenuController.prepareAndOpenFrame();
        });

    }
}
