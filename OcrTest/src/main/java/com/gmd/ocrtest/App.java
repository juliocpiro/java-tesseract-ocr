package com.gmd.ocrtest;

import java.io.File;

import net.sourceforge.tess4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TesseractException
    {
        System.out.println( "--1" );
        ITesseract tesseract = new Tesseract();
        
        System.out.println( "--2" );
        //String datapath = "src/main/resources/tessdata";
        String datapath = "src/main/resources/tessdata_best";
        tesseract.setDatapath(new File(datapath).getPath());
        //tesseract.setDatapath("D:/tesseract/tessdata_best/");
        
        tesseract.setLanguage("spa");
        
        System.out.println( "--3" );
        String fullText = tesseract.doOCR(new File("D:/tesseract/reporteletra.jpg"));
        
        System.out.println( "--4" );
        System.out.println(fullText);
    }
}
