import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer{
    private String nome;
    private String notificacao;

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNotificacao(){
        return this.notificacao;
    }

    public void cadastrar(ContaBanco conta){
        conta.addObserver(this);
    }

    public void update(Observable conta, Objects arg1){
        this.notificacao = this.nome + ", transferecia realizada no" + conta.toString();
    }
}
