public class Teams implements CanalNotificacao{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("[Teams] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
	}

}
