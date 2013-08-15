package PackageWM;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.util.HashMap;

import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class classWM {

	public classWM() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
		            PdfReader reader = new PdfReader("C:\\Users\\Omobola\\Desktop\\Research proposal.pdf");
		            int n = reader.getNumberOfPages();
		            PdfStamper stamp = new PdfStamper(reader, new FileOutputStream("C:\\Users\\Omobola\\Desktop\\NewPDFWithWatermarkImage.pdf"));
		            int i = 0;
		            PdfContentByte under;
		            Image img = Image.getInstance("logo.png");
		            img.setAbsolutePosition(100, 200);
		            while (i < n) {
		              i++;
		              under = stamp.getUnderContent(i);
		              under.addImage(img);
		            }
		            stamp.close();
		        }
		        catch (Exception de) {
		            de.printStackTrace();
		        }
        
     
		
	}

}
