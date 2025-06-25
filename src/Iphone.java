class iPhone implements Interfaces.ReprodutorMusical, Interfaces.Telefone, Interfaces.NavegadorNaInternet {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando: " + nomeMusica);
    }

    // Implementação dos métodos de Telefone
    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void receberLigacao() {
        System.out.println("Recebendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Implementação dos métodos de NavegadorNaInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
