package com.webhelp.ui.login.controller;

import com.webhelp.ui.login.view.MainMenuFrame;
import com.webhelp.ui.shared.controller.AbstractFrameController;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Log4j2
public class MainMenuController extends AbstractFrameController {
    private final MainMenuFrame mainMenuFrame;

    private final RecordingController recordingController;

    @Autowired
    public MainMenuController(MainMenuFrame mainMenuFrame, RecordingController recordingController) {
        this.mainMenuFrame = mainMenuFrame;
        this.recordingController = recordingController;
    }


    public void prepareAndOpenFrame() {

        registerAction(mainMenuFrame.getLoginButton(), (e) -> {
            //Call login Api
            openRecordingWindow(1950000L);
        });
        mainMenuFrame.setVisible(true);
    }


    private void openRecordingWindow(Long agentId) {
        recordingController.populateWithAgenId(agentId);
        recordingController.prepareAndOpenFrame();
        mainMenuFrame.setVisible(false);
    }
}
