package structural.decorator.decorator;

import structural.decorator.component.Stream;

public class UppercasePipe implements Stream {
    private final Stream stream;

    public UppercasePipe(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String content) {
        String upperCasedContent = toUpperCase(content);
        stream.write(upperCasedContent);
    }

    public String toUpperCase(String content) {
        return content.toUpperCase();
    }
}
