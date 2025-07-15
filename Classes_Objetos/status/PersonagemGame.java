public class PersonagemGame {

    private String nome;
    private int saudeAtual;
    private String status;

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
        if(saudeAtual > 0 ) {
            status = "vivo";
        }else {
            status = "morto";
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tomarDano(int quantidadeDeDano){
        saudeAtual = getSaudeAtual() - quantidadeDeDano;
        if(saudeAtual < 0){
            saudeAtual = 0;
        }
        setSaudeAtual(saudeAtual);
    }

    public void receberCura(int quantidadeDeCura){
        saudeAtual = getSaudeAtual() + quantidadeDeCura;
        if(saudeAtual > 100){
            saudeAtual = 100;
        }
        setSaudeAtual(saudeAtual);
    }

}