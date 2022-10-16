package RegistrandoVendas;

public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeIntens;
    private float valor;

    public Venda(Produto produto, Vendedor vendedor, float desconto, int quantidadeIntens, float valor){
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = desconto;
        this.quantidadeIntens = quantidadeIntens;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeIntens() {
        return quantidadeIntens;
    }

    public void setQuantidadeIntens(int quantidadeIntens) {
        this.quantidadeIntens = quantidadeIntens;
    }

    public float efetuarDesconto(float desconto){
        float d;
        d = quantidadeIntens * (produto.getValorVenda() * (desconto/100));

        if (produto.getValorVenda() - (produto.getValorVenda() * (desconto/100)) < produto.getValorCusto()){
            d = 0;
        }
        return d;

    }

    public float calcularValor(){
        if (produto.getPromocao() == 1){
            valor = (quantidadeIntens * produto.getValorVenda()) - (efetuarDesconto(desconto));
        }
        else {
            valor = quantidadeIntens * produto.getValorVenda();
        }
        return valor;
    }

    public float calcularComissao(){
        float comissao;
        if(produto.getPromocao() == 1){
            comissao = (vendedor.getComissao()/100) * valor/2;
        }
        else{
            comissao = (vendedor.getComissao()/100) * valor;
        }
        return comissao;
    }

    public void imprimir(){
        System.out.println("o vendedor " + vendedor.getNome() + " de código " + vendedor.getCodigo());
        System.out.println("Receberá de comissão R$ " + calcularComissao());
        System.out.println("Foram vendidos " + quantidadeIntens + " itens");
        System.out.println("O produto " + produto.getCodigo() + " com descrição " + produto.getDescricao());
        System.out.printf("O valor do produto R$ %.2f.%n ", produto.getValorVenda());

        int a = produto.getPromocao();
        if (a == 0){
            System.out.println("O produto nao esta em promocao.");
        }
        if (a == 1){
            System.out.println("O produto esta em promocao.");

            if (efetuarDesconto(desconto) == 0){
                System.out.println("Não tem desconto");
            }
            else{

                System.out.println("Valor do produto sem desconto R$ "+ quantidadeIntens * produto.getValorVenda());
                System.out.println("Porcentagem de descontos " + desconto + "%");
                System.out.println("Valor do desconto sobre o produto " + efetuarDesconto(desconto));
            }
        }

        System.out.println("Valor total da venda R$ " +  calcularValor());

    }
}
