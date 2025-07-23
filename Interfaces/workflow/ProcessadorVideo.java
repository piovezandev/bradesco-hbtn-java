import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

	private List<CanalNotificacao> canais = new ArrayList<>();
	
	public void registrarCanal(CanalNotificacao canalNotificacao) {
		this.canais.add(canalNotificacao);
		setCanais(canais);
	}
	
	public void processar(Video video) {
		getCanais()
		.stream()
		.forEach(p -> p.notificar(new Mensagem(video.getArquivo()+" - "+video.getFormatoVideo(), TipoMensagem.LOG)));
	}

	public List<CanalNotificacao> getCanais() {
		return canais;
	}

	public void setCanais(List<CanalNotificacao> canais) {
		this.canais = canais;
	}
	
	
}
