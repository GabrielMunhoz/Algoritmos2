
package escola;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
    	this.nome = nome;
    	this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }

    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "\nAluno [nome=" + nome + ", matricula=" + matricula + "]";
	}

}
