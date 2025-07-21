
import produtos.Produto;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itemPedido;


    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itemPedido = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido[] itemPedido) {
        this.itemPedido = itemPedido;
    }

    public double calcularTotal() {
        ItemPedido[] itens = getItemPedido();
        double total = 0;

        for (ItemPedido itemPedido : itens) {
            Produto produto = itemPedido.getProduto();
            total = total + (produto.obterPrecoLiquido() * itemPedido.getQuantidade());
        }

        return total - (total * getPercentualDesconto() / 100);
    }

    public void apresentarResumoPedido() {
        ItemPedido[] itens = getItemPedido();
        double total = 0;

        System.out.printf("------- RESUMO PEDIDO -------\n");
        for (ItemPedido itemPedido : itens) {
            Produto produto = itemPedido.getProduto();
            total = total + (produto.obterPrecoLiquido() * itemPedido.getQuantidade());
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    itemPedido.getProduto().getClass().getSimpleName(), produto.getTitulo(), produto.obterPrecoLiquido(),
                    itemPedido.getQuantidade(), (produto.obterPrecoLiquido() * itemPedido.getQuantidade()));
        }
        System.out.printf("----------------------------\n");
        System.out.printf("DESCONTO: %.2f\n", (total * getPercentualDesconto() / 100));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", total);
        System.out.printf("----------------------------\n");
        System.out.printf("TOTAL PEDIDO: %.2f\n", total - (total * getPercentualDesconto() / 100));
        System.out.printf("----------------------------\n");
    }

}
