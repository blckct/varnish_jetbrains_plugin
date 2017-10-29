package rocks.blackcat.vcl;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class VCLLexerAdapter extends FlexAdapter {
    public VCLLexerAdapter() {
        super(new VCLLexer((Reader) null));
    }
}
