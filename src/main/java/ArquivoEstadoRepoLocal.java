public class ArquivoEstadoRepoLocal extends ArquivoEstado{

    private ArquivoEstadoRepoLocal() {};

    private static ArquivoEstadoRepoLocal arquivoEstadoRepoLocal = new ArquivoEstadoRepoLocal();

    public static ArquivoEstadoRepoLocal getInstance() {
        return arquivoEstadoRepoLocal;
    }

    @Override
    public String getEstado() {
        return "Repositorio Local (HEAD)";
    }

    public boolean gitPush(Arquivo arquivo) {
        arquivo.setEstado(ArquivoEstadoRepoRemoto.getInstance());
        return true;
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
