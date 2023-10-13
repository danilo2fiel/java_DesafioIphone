public class IphoneUsuario {
    public static void main(String[] args) {
        
        //Instancia do Iphone que engloba o Ipod, Safari e Phone em um aparelho só.
        Iphone iphone = new Iphone();

        //comandos Phone:
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        //comandos Safari:
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        //comandos Ipod:
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
