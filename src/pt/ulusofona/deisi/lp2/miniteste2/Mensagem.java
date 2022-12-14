package pt.ulusofona.deisi.lp2.miniteste2;

public class Mensagem extends Notificacao{
    Boolean lida = false;

    public boolean isLida(){
        return lida;
    }

    public Boolean isMensagem(){
        return true;
    }

    public void setLida(Boolean lida) {
        this.lida = lida;
    }

    @Override
    public String toString() {
        String resposta;
        if (isLida()){
            resposta = "Não";
        }
        else {
            resposta = "Sim";
        }
        return id + " | " + descricao + " | Por ler? " + resposta;
    }

    public Mensagem(int id, String descricao) {
        super(id, descricao);
    }
}
