import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    public String inputFilePath;
    public String outputFilePath;
    public BufferedImage savedBufferedImage;

    // Constructor
    public Bitmap(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.savedBufferedImage = getBufferedImage(inputFilePath);
    }

    // Constructor for testing
    public Bitmap(BufferedImage bufferedImage) {
        this.savedBufferedImage = bufferedImage;
    }

    // Flips bitmap vertically
    public int[] flipVertically() {
        for (int i = 0; i < this.savedBufferedImage.getHeight(); i++) {
            for (int j = 0; j < this.savedBufferedImage.getWidth() / 2; j++) {
                int temporaryData = this.savedBufferedImage.getRGB(i, j);
                this.savedBufferedImage.setRGB(i, j, this.savedBufferedImage.getRGB(i, this.savedBufferedImage.getWidth() - j - 1));
                this.savedBufferedImage.setRGB(i, this.savedBufferedImage.getWidth() - j - 1, temporaryData);
            }
        }
        int[] bitmapDimensions = {this.savedBufferedImage.getHeight(), this.savedBufferedImage.getWidth()};
        return bitmapDimensions;
    }

    // Flips bitmap horizontally
    public int[] flipHorizontally() {
        for (int i = 0; i < this.savedBufferedImage.getHeight() / 2; i++) {
            for (int j = 0; j < this.savedBufferedImage.getWidth(); j++) {
                int temporaryData = this.savedBufferedImage.getRGB(i, j);
                this.savedBufferedImage.setRGB(i, j, this.savedBufferedImage.getRGB(this.savedBufferedImage.getHeight() - i - 1, j));
                this.savedBufferedImage.setRGB(this.savedBufferedImage.getHeight() - i - 1, j, temporaryData);
            }
        }
        int[] bitmapDimensions = {this.savedBufferedImage.getHeight(), this.savedBufferedImage.getWidth()};
        return bitmapDimensions;
    }

    // Converts bitmap to grayscale
    public int[] grayscale() {
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
        int[] bitmapDimensions = {this.savedBufferedImage.getHeight(), this.savedBufferedImage.getWidth()};
        return bitmapDimensions;
    }

    // Darkens the image
    public int[] darken() {
        for (int i = 0; i < this.savedBufferedImage.getHeight(); i++) {
            for (int j = 0; j < this.savedBufferedImage.getWidth(); j++) {
                int pixel = this.savedBufferedImage.getRGB(i,j);
                int alpha = (pixel >> 24)&0xff;
                int red = (pixel >> 16)&0xff + 150;
                int green = (pixel >> 8)&0xff + 150;
                int blue = pixel &0xff + 150;
                pixel = (alpha << 24) | (red << 16) | ( green << 8 ) | blue;
                this.savedBufferedImage.setRGB(i,j, pixel);
            }
        }
        int[] bitmapDimensions = {this.savedBufferedImage.getHeight(), this.savedBufferedImage.getWidth()};
        return bitmapDimensions;
    }

    // Saves the .BMP to where the user specified
    public void writeBufferedImage() {
        try {
            ImageIO.write(this.savedBufferedImage, "BMP", new File(this.outputFilePath));
            System.out.println("Transformation complete!");
        } catch (IOException error) {
            System.out.println(error);
        }
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
