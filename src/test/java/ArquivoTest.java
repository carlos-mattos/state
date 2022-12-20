import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoTest {

    Arquivo arquivo;

    @BeforeEach
    public void setUp() {
        arquivo = new Arquivo();
    }

    // Arquivo - Local

    @Test
    public void devePerformarGitAddArquivoLocal () {
        arquivo.setEstado(ArquivoEstadoLocal.getInstance());
        assertTrue(arquivo.gitAdd());
        assertEquals(ArquivoEstadoPreparacao.getInstance(), arquivo.getArquivoEstado());
    }

    @Test
    public void naoDevePerformarGitCommitArquivoLocal () {
        arquivo.setEstado(ArquivoEstadoLocal.getInstance());
        assertFalse(arquivo.gitCommit());
    }

    @Test
    public void naoDevePerformarGitPushArquivoLocal () {
        arquivo.setEstado(ArquivoEstadoLocal.getInstance());
        assertFalse(arquivo.gitPush());
    }

    // Arquivo - Preparacao

    @Test
    public void devePerformarGitCommitArquivoEstadoPreparacao () {
        arquivo.setEstado(ArquivoEstadoPreparacao.getInstance());
        assertTrue(arquivo.gitCommit());
        assertEquals(ArquivoEstadoRepoLocal.getInstance(), arquivo.getArquivoEstado());
    }

    @Test
    public void devePerformarGitAddArquivoEstadoPreparacao () {
        arquivo.setEstado(ArquivoEstadoPreparacao.getInstance());
        assertTrue(arquivo.gitAdd());
        assertEquals(ArquivoEstadoLocal.getInstance(), arquivo.getArquivoEstado());
    }

    @Test
    public void naoDevePerformarGitPushArquivoEstadoPreparacao() {
        arquivo.setEstado(ArquivoEstadoPreparacao.getInstance());
        assertFalse(arquivo.gitPush());
    }

    // Arquivo - Repo local

    @Test
    public void devePerformarGitPushArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoLocal.getInstance());
        assertTrue(arquivo.gitPush());
        assertEquals(ArquivoEstadoRepoRemoto.getInstance(), arquivo.getArquivoEstado());
    }

    @Test
    public void devePerformarGitAddArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoLocal.getInstance());
        assertTrue(arquivo.gitAdd());
        assertEquals(ArquivoEstadoLocal.getInstance(), arquivo.getArquivoEstado());
    }

    @Test
    public void devePerformarGitCommitArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoLocal.getInstance());
        assertTrue(arquivo.gitCommit());
        assertEquals(ArquivoEstadoRepoLocal.getInstance(), arquivo.getArquivoEstado());
    }

    // Arquivo - Repo remoto

    @Test
    public void naoDevePerformarGitPushArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoRemoto.getInstance());
        assertFalse(arquivo.gitPush());
    }

    @Test
    public void naoDevePerformarGitAddArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoRemoto.getInstance());
        assertFalse(arquivo.gitAdd());
    }

    @Test
    public void naoDevePerformarGitCommitArquivoEstadoRepoLocal () {
        arquivo.setEstado(ArquivoEstadoRepoRemoto.getInstance());
        assertFalse(arquivo.gitCommit());
    }

}