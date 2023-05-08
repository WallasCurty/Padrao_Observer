import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ClienteTest {
    @Test
    void deveNotificarUmCliente(){
        ContaBanco contaBanco = new ContaBanco(1,5,"Fernado Pereira","Banco do Brasil");
        Cliente cliente = new Cliente("Fernado Pereira");
        cliente.cadastrar(contaBanco);
        contaBanco.transferirDinheiro();
        assertEquals("Fernando Pereira, transferecia realizada no ContaBanco{numeroConta=1, agencia=5, nomeTitular= Fernando Pereira, nomeBanco=Banco do Brasil}",cliente.getNotificacao());
    }

    @Test
    void deveNotificarClientes(){
        ContaBanco contaBanco1 = new ContaBanco(2,5,"Jorge Silva","Banco do Brasil");
        ContaBanco contaBanco2 = new ContaBanco(3,5,"Ana Beatriz","Banco do Bradesco");
        Cliente cliente1 = new Cliente("Jorge Silva");
        Cliente cliente2 = new Cliente("Ana Beatriz");
        cliente1.cadastrar(contaBanco1);
        cliente2.cadastrar(contaBanco2);
        contaBanco1.transferirDinheiro();
        contaBanco2.transferirDinheiro();
        assertEquals("Jorge Silva, transferecia realizada no ContaBanco{numeroConta=1, agencia=5, nomeTitular= Jorge Silva, nomeBanco=Banco do Brasil}",cliente1.getNotificacao());
        assertEquals("Ana Beatriz, transferecia realizada no ContaBanco{numeroConta=1, agencia=5, nomeTitular= Ana Beatriz, nomeBanco=Banco do Bradesco}",cliente2.getNotificacao());
    }
    @Test
    void napDeveNotificarCliente(){
        ContaBanco contaBanco = new ContaBanco(1,5,"Fernado Pereira","Banco do Brasil");
        Cliente cliente = new Cliente("Fernado Pereira");
        cliente.cadastrar(contaBanco);
        contaBanco.transferirDinheiro();
        assertEquals(null,cliente.getNotificacao());
    }
    void deveNotificarClientesBradesco(){
        ContaBanco contaBanco1 = new ContaBanco(2,5,"Jorge Silva","Banco do Brasil");
        ContaBanco contaBanco2 = new ContaBanco(3,5,"Ana Beatriz","Banco do Bradesco");
        Cliente cliente1 = new Cliente("Jorge Silva");
        Cliente cliente2 = new Cliente("Ana Beatriz");
        cliente1.cadastrar(contaBanco1);
        cliente2.cadastrar(contaBanco2);
        contaBanco2.transferirDinheiro();
        assertEquals(null,cliente1.getNotificacao());
        assertEquals("Ana Beatriz, transferecia realizada no ContaBanco{numeroConta=1, agencia=5, nomeTitular= Ana Beatriz, nomeBanco=Banco do Bradesco}",cliente2.getNotificacao());
    }
}
