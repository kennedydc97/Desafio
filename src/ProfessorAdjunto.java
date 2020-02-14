public class ProfessorAdjunto extends Professor {
    private int qtdHoras;


    public ProfessorAdjunto(String nomeProf, String sobrenome, int codProfessor, int qtdHoras) {
        super(nomeProf, sobrenome, codProfessor);
        this.qtdHoras = qtdHoras;
    }

    public int getQtdMonitoria() {
        return qtdHoras;
    }

    public void setQtdMonitoria(int qtdMonitoria) {
        this.qtdHoras = qtdMonitoria;
    }
}
