import java.util.List;

public class EstudanteGrad extends Estudante {
	protected int HorasAtividades;

	public EstudanteGrad(int numero, String nome, String email, List<Matricula> matriculas, int horasAtividades) {
		super(numero, nome, email, matriculas);
		HorasAtividades = horasAtividades;
	}
	@Override
	protected void getTotalCreditos(){
    }
}
