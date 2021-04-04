package com.cheng.rostergenerator.helper;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ResourceHelper {
    
    public static ImageIcon imageIcon(String imagePath) {
        try {
            var resource = ResourceHelper.class.getResource(imagePath);
            var image = ImageIO.read(resource);
            return new ImageIcon(image);
        } catch (Exception exception) {
            FileHelper.printException(exception);
        }

        return null;
    }

    public static File file(String path) {
        try {
            var resource = ResourceHelper.class.getResource(path);
            var file = new File(resource.toURI());

            return file;
        } catch (Exception exception) {
            FileHelper.printException(exception);
        }

        return null;
    }

}
