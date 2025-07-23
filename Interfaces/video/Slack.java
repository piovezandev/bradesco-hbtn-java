public class Slack implements CanalNotificacao{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("[Slack] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
	}

}
