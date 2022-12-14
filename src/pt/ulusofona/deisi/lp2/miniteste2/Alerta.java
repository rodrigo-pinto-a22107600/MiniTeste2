package pt.ulusofona.deisi.lp2.miniteste2;

public class Alerta extends Notificacao{
    int ano;
    int mes;
    int dia;

    public int getAno() {
        return ano;
    }

    public Boolean isMensagem(){
        return false;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return id + " | " + descricao + " | data limite: " + ano + "/" + mes + "/" + dia;
    }

    public Alerta(int id, String descricao, int ano, int mes, int dia) {
        super(id, descricao);
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }



    public boolean isData(int ano, int mes, int dia){
        return this.ano == ano && this.mes == mes && this.dia == dia;
    }
}
