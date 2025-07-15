package abstracao;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    protected  LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularxp() {
        return XP_PADRAO+20;
    }
    @Override
    public String toString() {
        return "Mentoria"+ '\n' + "titulo='" + titulo + '\n' + ", descricao='" + descricao + '\n' + ", data=" + data;
    }
}
