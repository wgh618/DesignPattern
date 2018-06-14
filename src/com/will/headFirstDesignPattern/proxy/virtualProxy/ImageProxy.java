package com.will.headFirstDesignPattern.proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * ClassName:ImageProxy
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL, "CD cover");
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }
}
