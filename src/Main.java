public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Métodos de ReprodutorMusical
        meuIphone.tocarMusica();
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        
        // Métodos de Telefone
        meuIphone.fazerLigacao("123456789");
        
        // Métodos de NavegadorNaInternet
        meuIphone.abrirPagina("https://www.google.com");
    }
}
