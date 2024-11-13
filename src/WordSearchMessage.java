import javax.swing.*;

public class WordSearchMessage {
    private String palavraChave;
    private JList<FileSearchResult> lista;

    public WordSearchMessage(String palavraChave){
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public JList<FileSearchResult> listarFicheiros(String palavraChave) {
        DefaultListModel<FileSearchResult> resultado = new DefaultListModel<>();
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            FileSearchResult ficheiro = lista.getModel().getElementAt(i);
            if(ficheiro.getNomeFicheiro() == palavraChave)
                resultado.addElement(ficheiro);
        }
        return new JList<>(resultado);
    }
}
