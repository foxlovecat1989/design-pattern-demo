package structural.decorator.component;

public class MessageStream implements Stream {
    @Override
    public void write(String content) {
        System.out.println(content);
    }
}
