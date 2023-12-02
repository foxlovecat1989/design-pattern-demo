package structural.decorator;

import structural.decorator.component.MessageStream;
import structural.decorator.decorator.ReplaceHToEPipe;
import structural.decorator.decorator.UppercasePipe;

public class Main {
    public static void main(String[] args) {
            new ReplaceHToEPipe(new UppercasePipe(new MessageStream())).write("Hello World");
    }
}
