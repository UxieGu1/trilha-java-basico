public interface Interfaces {
    public interface ReprodutorMusical {
        void tocarMusica();
        void pausarMusica();
        void selecionarMusica(String nomeMusica);
    }

    public interface Telefone {
        void fazerLigacao(String numero);
        void receberLigacao();
        void iniciarCorreioVoz();
    }

    public interface NavegadorNaInternet {
        void abrirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }
}
