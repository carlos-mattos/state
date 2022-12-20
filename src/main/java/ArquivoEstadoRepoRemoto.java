public class ArquivoEstadoRepoRemoto extends ArquivoEstado{

    private ArquivoEstadoRepoRemoto() {};

    private static ArquivoEstadoRepoRemoto arquivoEstadoRepoRemoto = new ArquivoEstadoRepoRemoto();

    public static ArquivoEstadoRepoRemoto getInstance() {
        return arquivoEstadoRepoRemoto;
    }

    @Override
    public String getEstado() {
        return "Repositorio remoto (MASTER)";
    }
}
