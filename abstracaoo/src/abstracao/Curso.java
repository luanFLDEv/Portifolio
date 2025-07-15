package abstracao;

public class Curso extends Conteudo{
    protected  int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public void calcaularxp(){}

    @Override
    public String toString() {
        return "Curso"+'\n' +"titulo='" + titulo + '\n' + ", descricao='" + descricao + '\n' +", cargaHoraria=" + cargaHoraria +" ";
    }

    @Override
    public double calcularxp() {
        return XP_PADRAO*getCargaHoraria();
    }
}

