package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.file.File;
import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.handler.impl.*;

public class ChainPatternMain {

    public static void main(String[] args) {
        File file = null;
        
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");
        
        textHandler.nextHandler(docHandler);
        docHandler.nextHandler(excelHandler);
        excelHandler.nextHandler(audioHandler);
        audioHandler.nextHandler(imageHandler);
        
        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);
        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);
        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);
        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);
    }
}
