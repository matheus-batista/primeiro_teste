package curso_video;

public class Objeto {
    public static void main(String[] args){

        banco cliente_1 = new banco();
        cliente_1.cadastrar_cliente("MATHEUS");
        cliente_1.depositar(1000);
        cliente_1.status();
    }
}
