package pacotes.pacote;
/**
 * Atividade
 */

import java.util.ArrayList;
import java.util.Date;

public class Atividade {
    String identificacao;
    String descricao;
    String profissionaisString;
    String tarefasString;

    Date dataHrInicio;
    Date dataHrTermino;

    Usuario responsavel;

    ArrayList<String> profissionais;
    ArrayList<String> tarefas;
    
    public Atividade(String identificacao, String descricao, Date dataHrInicio, Date dataHrTermino, Usuario responsavel) {
        if (identificacao == null || identificacao == ""){
            System.out.println("missing value identificacao");
            return;
        }
        if (descricao == null || descricao == ""){
            System.out.println("missing value descricao");
            return;
        }
        if (dataHrInicio == null) {
            System.out.println("missing value dataHrInicio");
            return;
        }
        if (dataHrTermino == null) {
            System.out.println("missing value dataHrTermino");
            return;
        }
        if (responsavel == null || responsavel.toString() == "") {
            System.out.println("missing value responsavel");
            return;
        }
        this.identificacao = identificacao;
        this.descricao = descricao;
        this.dataHrInicio = dataHrInicio;
        this.dataHrTermino = dataHrTermino;
        this.responsavel = responsavel;
    }
    public void setProfissionais(String profissionais) {
        this.profissionais.add(profissionais);
    }
    public void setTarefas(String tarefas) {
        this.tarefas.add(tarefas);
    };
    private String profissionaisStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String profissional : this.profissionais) {
            stringBuilder.append(profissional).append(" ");
        }
        return stringBuilder.toString();
    }
    private String tarefasStr() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String tarefa : this.tarefas) {
            stringBuilder.append(tarefa).append(" ");
        }
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "Atividade [dataHrInicio=" + dataHrInicio + ", \ndataHrTermino=" + dataHrTermino + ", \ndescricao="
                + descricao + ", \nidentificacao=" + identificacao + ", \nprofissionaisString=" + profissionaisString
                + ", \nresponsavel=" + responsavel + ", \ntarefasString=" + tarefasString + ", \nprofissionais="
                +profissionaisStr()+", \ntarefas="+tarefasStr()+"]";
    }
    
}