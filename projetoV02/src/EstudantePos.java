import java.util.List;

public class EstudantePos extends Estudante{
	protected String tema;
	protected String orientador;
	
	
	
	public EstudantePos(int numero, String nome, String email, List<Matricula> matriculas, String tema,
			String orientador) {
		super(numero, nome, email, matriculas);
		this.tema = tema;
		this.orientador = orientador;
	}
	
	@Override
	protected void getTotalCreditos(){
    }

}
