public abstract class ArquivoEstado {

    public abstract String getEstado();

    public boolean gitAdd(Arquivo arquivo){
        return false;
    }

    public boolean gitCommit(Arquivo arquivo) {
        return false;
    }

    public boolean gitPush(Arquivo arquivo) {
        return false;
    }

}
