package RegistrandoVendas;

public class Vendedor {

    private String nome;
    private int codigo;
    private float comissao = 10;
    private String endereco;

    public Vendedor(String nome, String endereco, int codigo){                      //Construtor
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
