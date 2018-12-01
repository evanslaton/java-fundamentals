import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    public String inputFilePath;
    public String outputFilePath;
    public String transformName;
    public BufferedImage savedBufferedImage;

    public Bitmap(String inputFilePath, String outputFilePath, String transformName) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.transformName = transformName;
        this.savedBufferedImage = getBufferedImage(inputFilePath);
    }

    // Saves the altered .BMP to where the user specified
    public void writeBufferedImage() {
        try {
            ImageIO.write(this.savedBufferedImage, "BMP", new File(this.outputFilePath));
        } catch (IOException error) {
            System.out.println(error);
        }
    }

    // Flips the .BMP vertically and saves
    public void flipVertically() {
        for (int i = 0; i < this.savedBufferedImage.getHeight(); i++) {
            for (int j = 0; j < this.savedBufferedImage.getWidth() / 2; j++) {
                int temporaryData = this.savedBufferedImage.getRGB(i, j);
                this.savedBufferedImage.setRGB(i, j, this.savedBufferedImage.getRGB(i, this.savedBufferedImage.getWidth() - j - 1));
                this.savedBufferedImage.setRGB(i, this.savedBufferedImage.getWidth() - j - 1, temporaryData);
            }
        }
        this.writeBufferedImage();
    }

    // Converts the .BMP to grayscale
    public void grayscale() {
        for (int i = 0; i < this.savedBufferedImage.getHeight(); i++) {
            for (int j = 0; j < this.savedBufferedImage.getWidth(); j++) {
                int pixel = this.savedBufferedImage.getRGB(i,j);
                int alpha = (pixel >> 24)&0xff;
                int red = (pixel >> 16)&0xff;
                int green = (pixel >> 8)&0xff;
                int blue = pixel &0xff;
                int average = (red + green + blue) / 3;
                pixel = (alpha << 24) | (average << 16) | ( average << 8 ) | average;
                this.savedBufferedImage.setRGB(i,j, pixel);
            }
        }
//        this.writeBufferedImage();
    }

    // Reads the .BMP file specified by the user and returns it as a BufferedImage
    public static BufferedImage getBufferedImage(String inputFilePath) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(inputFilePath));
        } catch (IOException error) {
            System.out.println(error);
        }
        return image;
    }
}
