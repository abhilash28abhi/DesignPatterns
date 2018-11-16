package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.file.File;

public interface Handler {

    public void nextHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();
}
