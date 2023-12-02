package structural.decorator.decorator;

import structural.decorator.component.Stream;

public class ReplaceHToEPipe implements Stream {
    private final Stream stream;

    public ReplaceHToEPipe(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String content) {
        String replacedHToE = getReplacedHToE(content);
        stream.write(replacedHToE);
    }

    public String getReplacedHToE(String content) {
        return content.replaceAll("H", "E").replaceAll("h", "e");
    }
}
