

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String codigo;
    private int creditos;
    private List<Matricula> matriculas;

    public Disciplina(String codigo, int creditos, List<Matricula> matriculas) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.matriculas = matriculas;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public int getCreditos(){
        return this.creditos;
    }

    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }  
    
    public List<Estudante> getEstudantesMatriculados(){
        List<Estudante> estudantes = new ArrayList<>();
        for(Matricula matricula : matriculas){
        	estudantes.add(matricula.getEstudante());
        	}
        
        return estudantes;
    }
}
