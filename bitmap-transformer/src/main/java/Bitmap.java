import javax.imageio.ImageIO;
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

    // Writes this.savedBufferedImage to where the user specified
    public void writeBufferedImage() {
        try {
            ImageIO.write(this.savedBufferedImage, "BMP", new File(this.outputFilePath));
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
