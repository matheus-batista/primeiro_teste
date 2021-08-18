package curso_video;

public class banco {

    public String cliente;
    private float saldo;
    public int idade;
    public char tipo_cliente;

    float consultar_saldo(){
        return saldo;
    }

    void cadastrar_cliente(String nome){
        this.cliente=nome;
    }

    void depositar(float cash){
        this.saldo=cash;
    }

    void status(){
        System.out.println("Cliente:"+cliente);
        System.out.println("Saldo:"+saldo);
        System.out.println("Idade:"+idade);
        System.out.println("Tipo cliente:"+tipo_cliente);
    }
}
