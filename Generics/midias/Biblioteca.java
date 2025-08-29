import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {
	
	private List<T> valores = new ArrayList<T>();
	
	
	public void adicionarMidia(T generico) {
		valores.add(generico);
	}
	
	public List<T> obterListaMidias() {
		return valores;	
	}

	public List<T> getValores() {
		return valores;
	}

	public void setValores(List<T> valores) {
		this.valores = valores;
	}

}
