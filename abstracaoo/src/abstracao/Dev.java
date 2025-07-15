package abstracao;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev{
    protected String nome;
    protected Set<Conteudo> conteudosIncritos=new LinkedHashSet<>();
    protected Set<Conteudo>conteudosConcluidos=new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }
    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }

    public void incresverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()){
           this.conteudosConcluidos.add(conteudo.get());
           this.conteudosIncritos.remove(conteudo.get());
        }else{
            System.err.println("Voce não esta matriculado em nenhum conteudo.");
        }
    }
    public double calcularXpTotal(){
       return this.conteudosConcluidos
               .stream()
               .mapToDouble(conteudo->conteudo.calcularxp())
               .sum();
    }

    @Override
    public String toString() {
        return "Dev" + " nome='" + nome + '\n' +
                "conteudos incritos=" + conteudosIncritos +'\n'+
                "conteudos Concluidos=" + conteudosConcluidos;
    }
}
