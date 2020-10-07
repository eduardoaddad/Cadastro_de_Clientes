package cadastro.de.clientes;

/**
 *
 * @author eduar
 */
public class CadastroDeClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //Instânciar  os objetos
        UICadastroCliente formulario = new UICadastroCliente();
        Pessoa cliente = new Pessoa(formulario.nome,formulario.cpf,formulario.endereço, formulario.cidade, formulario.estado);

    }
    
}
