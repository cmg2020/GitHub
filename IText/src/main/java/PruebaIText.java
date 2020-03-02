
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PruebaIText{

    public static void main(String[] args) throws FileNotFoundException, DocumentException
    {
        Document document = new Document();
        @SuppressWarnings("unused")
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        document.open();

        Paragraph paragraph = new Paragraph();
        paragraph.add("Hello World!");

        document.add(paragraph);
        document.close();
    }
}
