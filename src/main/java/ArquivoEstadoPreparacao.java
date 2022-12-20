public class ArquivoEstadoPreparacao extends ArquivoEstado {

    private ArquivoEstadoPreparacao() {};

    private static ArquivoEstadoPreparacao arquivoEstadoPreparacao = new ArquivoEstadoPreparacao();

    public static ArquivoEstadoPreparacao getInstance() {
        return arquivoEstadoPreparacao;
    }

    @Override
    public String getEstado() {
        return "Area de preparacao";
    }

    public boolean gitAdd(Arquivo arquivo) {
        arquivo.setEstado(ArquivoEstadoLocal.getInstance());
        return true;
    }

    public boolean gitCommit(Arquivo arquivo) {
        arquivo.setEstado(ArquivoEstadoRepoLocal.getInstance());
        return true;
    }
}
