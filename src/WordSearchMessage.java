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

    public JList<String> ficheirosComPalavraChave(String palavraChave) {
        DefaultListModel<String> resultado = new DefaultListModel<>();
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String ficheiro = lista.getModel().getElementAt(i);
            if (ficheiro.contains(palavraChave)) {
                resultado.addElement(ficheiro);
            }
        }
        return new JList<>(resultado);
    }
}
