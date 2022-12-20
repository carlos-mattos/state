public class ArquivoEstadoLocal extends ArquivoEstado{

    private ArquivoEstadoLocal() {};

    private static ArquivoEstadoLocal arquivoEstadoLocal = new ArquivoEstadoLocal();

    public static ArquivoEstadoLocal getInstance() {
        return arquivoEstadoLocal;
    }

    @Override
    public String getEstado() {
        return "Diretorio de trabalho";
    }

    public boolean gitAdd(Arquivo arquivo){
        arquivo.setEstado(ArquivoEstadoPreparacao.getInstance());
        return true;
    }

}
