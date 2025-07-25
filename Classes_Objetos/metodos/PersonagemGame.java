public class PersonagemGame {

    private String nome;
    private int saudeAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void tomarDano(int quantidadeDeDano){
      saudeAtual = getSaudeAtual() - quantidadeDeDano;
      if(saudeAtual < 0){
        saudeAtual = 0;
      }
    }

    public void receberCura(int quantidadeDeCura){
        saudeAtual = getSaudeAtual() + quantidadeDeCura;
        if(saudeAtual > 100){
            saudeAtual = 100;
        }
    }

}