package pt.ulusofona.deisi.lp2.miniteste2;

import java.util.ArrayList;

public class Contribuinte {
    int nif;
    String nome;
    ArrayList<Notificacao> notificacoes = new ArrayList<>();

    public int getNif() {
        return nif;
    }

    public String getNome() {
        return nome;
    }

    public Contribuinte(int nif, String descricao) {
        this.nif = nif;
        this.nome = descricao;
    }

    public ArrayList<Notificacao> getNotificacoes(){
        return notificacoes;
    }

    public void adicionarNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }

    public String getAlertas(){
        String resultado = "";
        for (Notificacao notificacao : notificacoes) {
            if (!notificacao.isMensagem()){
                resultado += notificacao.toString() + "\n";
            }
        }
        return resultado;
    }

    public String getMensagens(){
        String resultado = "";
        for (Notificacao notificacao : notificacoes) {
            if (notificacao.isMensagem()){

                resultado += notificacao.toString() + "\n";
            }
        }
        return resultado;
    }

    public String getAlertas(int ano, int mes, int dia){
        String resultado = "";
        for (Notificacao notificacao : notificacoes) {
            if (!notificacao.isMensagem()){
                if (((Alerta)notificacao).isData(ano,mes,dia)){
                    resultado += notificacao.toString() + "\n";

                }


            }
        }
        return resultado;
    }

    public String getMensagensPorLer(){
        String resultado = "";
        int numMensagens = 0;
        for (Notificacao notificacao : notificacoes) {
            if (notificacao.isMensagem()){
                if(((Mensagem) notificacao).isLida()){
                    numMensagens ++;
                    resultado += notificacao.toString() + "\n";
                }

            }
        }
        if (numMensagens == 0){
            return "Sem mensagens!" ;
        }
        return resultado;
    }
}
