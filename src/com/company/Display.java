package com.company;

import javax.swing.*;
import java.awt.*;

public abstract class Display {
    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void Create(int width, int heigh, String title){
        if (created)
            return;
        window = new JFrame(title);
        content = new Canvas();

        Dimension dimension = new Dimension(width, heigh);
        content.setPreferredSize(dimension);

        window.setResizable(false);
        window.getContentPane().add(content);

    }
}
