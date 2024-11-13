public class FileSearchResult {
    private WordSearchMessage procura;
    private String hash;
    private long tamanhoFicheiro;
    private String nomeFicheiro;
    private String addrNo;
    private int portaNo;

    public FileSearchResult(WordSearchMessage procura, long tamanhoFicheiro, String nomeFicheiro, String addrNo, int portaNo){
        this.procura=procura;
        this.tamanhoFicheiro=tamanhoFicheiro;
        this.hash = hash;
        this.nomeFicheiro=nomeFicheiro;
        this.addrNo=addrNo;
        this.portaNo=portaNo;
    }

    public WordSearchMessage getPalavraChave() {
        return procura;
    }

    public String getHash() {
        return hash;
    }

    public long getTamanhoFicheiro() {
        return tamanhoFicheiro;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public String getAddrNo() {
        return addrNo;
    }

    public int getPortaNo() {
        return portaNo;
    }
}
