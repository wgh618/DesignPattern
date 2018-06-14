package com.will.headFirstDesignPattern.proxy.virtualProxy;

import javax.swing.*;
import java.net.URL;

/**
 * ClassName:ImageProxyTestDrive
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class ImageProxyTestDrive {

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        Icon icon = new ImageProxy(new URL(""));
        // TODO
    }
}
