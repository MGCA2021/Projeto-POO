

import java.util.ArrayList;
import java.util.List;

public abstract class Estudante {
	protected String nome;
	protected String email;
	protected int numero;
	protected List<Matricula> matriculas;

    public Estudante(int numero, String nome, String email, List<Matricula> matriculas) {
        this.numero = numero;
        this.nome = nome;
        this.email = email;
        this.matriculas = matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public int getId() {
        return this.numero;
    }

    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }
    
    protected void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }
    protected List<Disciplina> getDisciplinasMatriculadas(){
    	List<Disciplina> disciplinas = new ArrayList<>();
    	for(Matricula matricula : matriculas){
    		disciplinas.add(matricula.getDisciplina());
    	}
    	return disciplinas;
	}
    protected void getTotalCreditos(){
    }
    
    
}
