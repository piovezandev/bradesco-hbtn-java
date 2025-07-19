
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

}
