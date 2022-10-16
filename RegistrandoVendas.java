package RegistrandoVendas;

public class RegistrandoVendas {
    public static void main(String[] args) {

        Produto banana =  new Produto(01,"Concha de bananas, fruta tropical",7,3,0);
        Vendedor marcos = new Vendedor("Marcos", "rua noruega, bancários, nº 555",111);
        Venda venda01 = new Venda(banana, marcos, 0, 2,7);
        venda01.calcularValor();
        venda01.calcularComissao();
        venda01.imprimir();

        System.out.println("-------------------------------------------------");

        Produto mochila = new Produto(56, "Mochila de tecido leve e prática",100,80,1);
        Vendedor mariana = new Vendedor("Mariana","rua Tarcísio, bessa, nº102,",112);
        Venda venda02 = new Venda(mochila,mariana,10,3,100);
        venda02.calcularValor();
        venda02.calcularComissao();
        venda02.imprimir();

        System.out.println("-------------------------------------------------");

        Venda venda03 = new Venda(mochila, mariana, 30,2,100);
        venda03.calcularValor();
        venda03.calcularComissao();
        venda03.imprimir();
    }
}
