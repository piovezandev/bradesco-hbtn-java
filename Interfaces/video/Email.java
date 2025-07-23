public class Email implements CanalNotificacao{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("[Email] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
	}

}
