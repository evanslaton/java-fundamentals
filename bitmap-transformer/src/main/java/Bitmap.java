import java.awt.image.BufferedImage;
import java.nio.file.Path;

public class Bitmap {
    public String inputFilePath;
    public String outputFilePath;
    public String transformName;
    public BufferedImage image;

    public Bitmap(String inputFilePath, String outputFilePath, String transformName, BufferedImage image) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.transformName = transformName;
        this.image = image;
    }
}
