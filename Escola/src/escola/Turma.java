
package escola;


public class Turma {
    private String disciplina;
    private Aluno alunos[] = new Aluno[5];
    
    public Turma(Aluno[] alunos,String disci) {
    	this.alunos=alunos;
    	disciplina = disci;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

       
    public Aluno[] getAlunos() {
		return alunos;
	}

	public String escreve() {
        int x = 0;
        String aluno = "" ;
        while(x < 5){
           aluno+=alunos[x].toString();
           x++;
        }
        return "\nAlunos " + aluno;
    }

	public void alunoPresente(int matricula) {
		int x = 0;
		while(x<alunos.length) {
			if(alunos[x].getMatricula()==matricula) {
				System.out.println("Alunos este presente na turma: ");
				break;
			}
		}
		
	}
    
}
