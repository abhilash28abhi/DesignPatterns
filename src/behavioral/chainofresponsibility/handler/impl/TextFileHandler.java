package behavioral.chainofresponsibility.handler.impl;

import behavioral.chainofresponsibility.file.File;
import behavioral.chainofresponsibility.handler.Handler;

public class TextFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void nextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("text")) {
            System.out.println("Process and saving text file... by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " fowards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
