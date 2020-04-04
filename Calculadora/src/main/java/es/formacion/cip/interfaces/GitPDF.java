package es.formacion.cip.interfaces;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

/**
 * Generador basico de PDF desde lineas de caracteres
 * Usando iText 5.5.6
 * Ficheros adicionles necesarios: Calculadora.jpg (Grafico de cabecera)
 * Entrada: Lineas de texto
 * Salida: GitPDF.pdf
 */

public class GitPDF{

    // Definición de fuentes

    private static final Font helvetica12 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    private static final Font helvetica18 = FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD);
    private static final Font helvetica9 = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);

    public static void main(String[] args) throws FileNotFoundException, DocumentException {

        // Bloques de textos

        String cabecera1 = "La mejor calculadora del mercado!!!";
        String cabecera2 = "Comenzando";
        String cabecera3 = "Pre-requisitos";
        String cabecera4 = "Instalación";

        String texto1 = "Puedes descargar mi calculadora para someterla a tus pruebas locas e intentar reventarla por todos lados... Hay gente que lo ha conseguido!!!\n" + "Mira ***DOWNLOADS*** para saber como descargarla.";
        String texto2 = "Necesitaras un ordenador decente (como los de la NASA) que funcione y mucha paciencia... Te dejo que hurges en el codigo, como hacen los niños pequeños con sus narices...";
        String texto3 = "Abre tu IDE y carga mi proyecto... En unos minutos tu disco duro estara formateado y veras que gracioso, sobre todo cuando veas que " +
                "has perdido todas las fotos de cuando fuiste a Eurodisney y te pusiste el traje de Blancanieves!!!\n" + "ESPERO QUE TE GUSTE Y APRENDAS A NO METERTE CON GENTE MAYOR...";
        String texto4 = "(P.D.: No se admiten reclamaciones por fallos del ordenador o robos de numeros de tarjetas de credito... Ni lloricas!!!)";
        String texto5 = "Copyright CMG/2020.";

        //Generamos el documento PDF con nombre: GitPDF.pdf

        Document document = new Document();
        try {
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("GitPDF.pdf"));
            document.open();

            //Generamos el grafico de la cabecera...

            Image imagen = Image.getInstance("calculadora.jpg");// Nombre del grafico
            imagen.scaleToFit(500, 150);// Reescalado de imagen
            imagen.setAlignment(Element.ALIGN_CENTER);// Centrado
            document.add(imagen);// Añadir grafico

            //Generamos los bloques de texto

            Paragraph paragraph1 = new Paragraph();
            paragraph1.setFont(helvetica18);
            paragraph1.setAlignment(Element.ALIGN_CENTER);
            paragraph1.add(cabecera1);
            document.add(paragraph1);

            document.add(Chunk.NEWLINE);// Espacio en blanco

            Paragraph paragraph3 = new Paragraph();
            paragraph3.setFont(helvetica18);
            paragraph3.add(cabecera2);
            document.add(paragraph3);

            Paragraph paragraph4 = new Paragraph();
            paragraph4.setFont(helvetica12);
            paragraph4.add(texto1);
            document.add(paragraph4);

            document.add(Chunk.NEWLINE);// Espacio en blanco

            Paragraph paragraph5 = new Paragraph();
            paragraph5.setFont(helvetica18);
            paragraph5.add(cabecera3);
            document.add(paragraph5);

            Paragraph paragraph6 = new Paragraph();
            paragraph6.setFont(helvetica12);
            paragraph6.add(texto2);
            document.add(paragraph6);

            document.add(Chunk.NEWLINE);// Espacio en blanco

            Paragraph paragraph7 = new Paragraph();
            paragraph7.setFont(helvetica18);
            paragraph7.add(cabecera4);
            document.add(paragraph7);

            Paragraph paragraph8 = new Paragraph();
            paragraph8.setFont(helvetica12);
            paragraph8.add(texto3);
            document.add(paragraph8);

            document.add(Chunk.NEWLINE);// Espacio en blanco
            document.add(Chunk.NEWLINE);// Espacio en blanco

            Paragraph paragraph9 = new Paragraph();
            paragraph9.setFont(helvetica12);
            paragraph9.add(texto4);
            document.add(paragraph9);

            document.add(Chunk.NEWLINE);// Espacio en blanco
            document.add(Chunk.NEWLINE);// Espacio en blanco

            Paragraph paragraph10 = new Paragraph();
            paragraph10.setFont(helvetica9);
            paragraph10.add(texto5);
            document.add(paragraph10);

            //Cerramos el documento
            document.close();
            System.out.println("Se ha generado el documento GitPDF.pdf");

        } catch (DocumentException | IOException e) {
            e.printStackTrace();

        }

    }
}
