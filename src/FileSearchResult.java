import javax.swing.*;

public class FileSearchResult {
    private WordSearchMessage palavraChave;
    //private String hash;
    private long tamanhoFicheiro;
    private String nomeFicheiro;
    private String addrNo;
    private int portaNo;

    private JList<String> lista;

    public FileSearchResult(WordSearchMessage palavraChave, long tamanhoFicheiro, String nomeFicheiro, String addrNo, int portaNo){
        this.palavraChave=palavraChave;
        this.tamanhoFicheiro=tamanhoFicheiro;
        //this.hash = hash;
        this.nomeFicheiro=nomeFicheiro;
        this.addrNo=addrNo;
        this.portaNo=portaNo;
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
