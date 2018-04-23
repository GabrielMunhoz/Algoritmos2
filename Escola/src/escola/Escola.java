package escola;

public class Escola {
	static Console console = new Console();
    public static void main(String[] args) {
      
    	chamada(criaTurma(CriaAluno()));
      
    }
    private static Aluno[] CriaAluno() {
    	System.out.println("------Criando alunos-------");
		Aluno aluno[] = new Aluno[5];
		int x = 0;
		while(x<aluno.length) {
			aluno[x++] = new Aluno(console.dString("Digite o nome do aluno:")
					,x);
		}
		System.out.println("------alunos Criados-------");
		return aluno;
	}
	public static Turma criaTurma(Aluno[] alunos) {
		System.out.println("------Criando Turma-------");
    	//Cria turma com no maximo 5 alunos
		
		Turma turma = new Turma(alunos,console.dString("Digite a disciplina: "));
		System.out.println("------Turma criada-------");
		return turma;
    }
    public static void chamada(Turma turma) {
    	System.out.println("------Realizando Chamada-------");
    	System.out.println("------Alunos da turma de "+turma.getDisciplina()+"-------");
    	System.out.print(turma.escreve());
    	System.out.println("Para realiza a chamada, Digite a matricula: ");
    	int x=0;
    	while(x<turma.getAlunos().length) {
    		turma.alunoPresente(console.dInt("Digite a matricula:"));
    	}
    	
    }
    public static void adicionarAvaliação() {
    	//adiciona ate 3 avaliacoes para cada aluno 
    	
    }
    public static void verificaMediaAlunos() {
    	//verifica media dos alunos
    	
    }
}
