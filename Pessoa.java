
package cadastro.de.clientes;

public class Pessoa {
    
    //Atributos
    private int id;
    private String nome;
    private String cpf;
    private String endereço;
    private String cidade;
    private String estado;

    // Construtor de elementos
    public Pessoa(String nome, String cpf, String endereço, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    //Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    
}
