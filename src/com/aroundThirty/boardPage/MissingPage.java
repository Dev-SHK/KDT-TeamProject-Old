package com.aroundThirty.boardPage;

import javax.swing.*;
import java.awt.*;

public class MissingPage extends JPanel {

    public MissingPage() {
        this.setBackground(Color.ORANGE);
        JButton btn = new JButton("잃어버렸어요");
        this.add(btn);
    }
}