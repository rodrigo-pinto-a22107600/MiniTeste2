package pt.ulusofona.deisi.lp2.miniteste2;

public abstract class Notificacao {
    int id;
    String descricao;

    public int getId() {
        return id;
    }

    abstract public Boolean isMensagem();


    abstract public String toString();

    public Notificacao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
