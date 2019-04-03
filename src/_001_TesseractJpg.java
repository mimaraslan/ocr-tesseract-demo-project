import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class _001_TesseractJpg {
	public static void main(String[] args) {
		Tesseract tesseract = new Tesseract();
		try {
			tesseract.setDatapath("tessdata");
			//String text = tesseract.doOCR(new File("ExampleEN.jpg"));
			String text = tesseract.doOCR(new File("ExampleTR.jpg"));
			//String text = tesseract.doOCR(new File("ExampleRU.jpg"));
			System.out.print(text);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}
}