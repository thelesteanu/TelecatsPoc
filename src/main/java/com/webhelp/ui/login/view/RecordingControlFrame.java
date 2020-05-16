package com.webhelp.ui.login.view;

import com.webhelp.util.Borders;
import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.swing.*;

import static com.webhelp.util.ConstMessagesEN.Labels.RECORDING_CONTROLS;

@Component
@Getter
public class RecordingControlFrame extends JFrame {
    private JTextField agentIdField;
    private JLabel agentIdLabel;
    private JTextPane greetingLabel;
    private JButton pauseButton;
    private JButton resumeButton;
    private JPanel recordingPanel;

    public RecordingControlFrame() {
        setFrameUp();
        initComponents();
        pack();
    }

    private void setFrameUp() {
        getRootPane().setBorder(Borders.createEmptyBorder());
        setTitle(RECORDING_CONTROLS);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        add(recordingPanel);
    }

}
