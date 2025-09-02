import java.util.ArrayList;

public class Pedido {

	private ArrayList<PedidoCookie> cookies;

	public Pedido() {
		cookies = new ArrayList<PedidoCookie>();
	}
	
	public void adicionarPedidoCookie (PedidoCookie pedidoCookie) {
		cookies.add(pedidoCookie);
	}
	
	public int obterTotalCaixas() {
		int quantidade = 0;
		for (int i = 0; i < cookies.size(); i++) {
			PedidoCookie cookie = cookies.get(i);
			quantidade += cookie.getQuantidadeCaixas();
		}
		return quantidade;
	}
	
	public int removerSabor(String sabor) {
		int removidos = 0;
		for (int i = 0; i < cookies.size(); i++) {
			PedidoCookie cookie = cookies.get(i);
			if(cookie.getSabor().equalsIgnoreCase(sabor)) {
				cookies.remove(i);
				removidos += cookie.getQuantidadeCaixas();
			}
		
		}		
		return removidos;
	}
}
