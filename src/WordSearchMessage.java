import javax.swing.*;

public class WordSearchMessage {
    private String palavraChave;
    private JList<String> lista;

    public WordSearchMessage(String palavraChave){
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }
}
