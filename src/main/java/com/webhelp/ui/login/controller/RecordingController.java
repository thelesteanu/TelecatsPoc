package com.webhelp.ui.login.controller;

import com.webhelp.ui.login.view.RecordingControlFrame;
import com.webhelp.ui.shared.controller.AbstractFrameController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import static com.webhelp.util.ConstMessagesEN.Labels.GREETING;


@Controller
public class RecordingController extends AbstractFrameController {

    private final RecordingControlFrame recordingControlFrame;

    @Autowired
    public RecordingController(RecordingControlFrame recordingControlFrame) {
        this.recordingControlFrame = recordingControlFrame;
    }

    public void prepareAndOpenFrame() {
        recordingControlFrame.setSize(500, 500);
        recordingControlFrame.setVisible(true);

        registerAction(recordingControlFrame.getPauseButton(), (e) -> {
            //call pause api;
            //TODO use agent id
        });

        registerAction(recordingControlFrame.getResumeButton(), (e) -> {
            //call resume api;
        });
    }

    public void populateWithAgenId(Long agentID){
        recordingControlFrame.getAgentIdField().setText(agentID.toString());
        recordingControlFrame.getGreetingLabel().setText(String.format(GREETING, agentID));
    }

}
