public class FileSearchResult {
    private WordSearchMessage palavraChave;
    //private String hash;
    private long tamanhoFicheiro;
    private String nomeFicheiro;
    private String addrNo;
    private int portaNo;

    public FileSearchResult(WordSearchMessage palavraChave, long tamanhoFicheiro, String nomeFicheiro, String addrNo, int portaNo){
        this.palavraChave=palavraChave;
        this.tamanhoFicheiro=tamanhoFicheiro;
        //this.hash = hash;
        this.nomeFicheiro=nomeFicheiro;
        this.addrNo=addrNo;
        this.portaNo=portaNo;
    }
}
