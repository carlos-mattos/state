public class Arquivo {

    private String nomeArquivo;
    private ArquivoEstado arquivoEstado;

    public Arquivo(){
        this.arquivoEstado = ArquivoEstadoLocal.getInstance();
    }

    public void setEstado(ArquivoEstado arquivoEstado) {
        this.arquivoEstado = arquivoEstado;
    }

    public boolean gitAdd(){
        return arquivoEstado.gitAdd(this);
    }

    public boolean gitCommit() {
        return arquivoEstado.gitCommit(this);
    }

    public boolean gitPush() {
        return arquivoEstado.gitPush(this);
    }


    public String getNomeEstado() {
        return arquivoEstado.getEstado();
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nome) {
        this.nomeArquivo = nome;
    }

    public ArquivoEstado getArquivoEstado() {
        return arquivoEstado;
    }

}
