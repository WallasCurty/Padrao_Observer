import java.util.Observable;
public class ContaBanco extends Observable{
    private Integer numeroConta;
    private Integer agencia;
    private String nomeTitular;
    private String nomeBanco;

    public ContaBanco (Integer numeroConta, Integer agencia, String nomeTitular, String nomeBanco){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.nomeBanco = nomeBanco;
    }

    public void transferirDinheiro(){
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString(){
        return "ContaBanco{"+
                "numeroConta"+ numeroConta +
                ",agencia"+ agencia +
                ",nomeTitular"+ nomeTitular + '\''+
                ",nomeBanco" + nomeBanco + '\''+
                '}';
    }
}
