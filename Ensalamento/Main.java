import java.util.ArrayList;

// Classe para representar uma Pessoa (Aluno ou Professor)
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe para representar um Professor
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}

// Classe para representar um Aluno
class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}

// Classe para representar um Curso
class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe para representar uma Disciplina
class Disciplina {
    private String nome;
    private Curso curso;

    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
}

// Classe para representar uma Turma
class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirTurma() {
        System.out.println("Turma de " + disciplina.getNome() + " ministrada por " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getCurso() + ")");
        }
        System.out.println();
    }
}

// Classe para realizar o ensalamento
class Ensalamento {
    public static void main(String[] args) {
        // Criação de cursos
        Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        // Criação de disciplinas
        Disciplina pooTI = new Disciplina("POO", cursoTI);
        Disciplina edTI = new Disciplina("Estrutura de Dados", cursoTI);
        Disciplina biADM = new Disciplina("BI", cursoADM);

        // Criação de professores
        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        // Criação de alunos
        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno peterson = new Aluno("Peterson", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno capitú = new Aluno("Capitú", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno amelia = new Aluno("Amélia", "TI");

        // Criação de turmas
        Turma turmaPOOTI = new Turma(mia, pooTI);
        Turma turmaEDTI = new Turma(saulo, edTI);
        Turma turmaBIADM = new Turma(paula, biADM);

        // Adicionar alunos às turmas
        turmaPOOTI.adicionarAluno(alfredo);
        turmaPOOTI.adicionarAluno(wendel);
        turmaPOOTI.adicionarAluno(debra);
        turmaPOOTI.adicionarAluno(bruno);
        turmaPOOTI.adicionarAluno(julieta);
        turmaPOOTI.adicionarAluno(capitú);
        turmaPOOTI.adicionarAluno(amelia);

        turmaEDTI.adicionarAluno(wendel);
        turmaEDTI.adicionarAluno(debra);
        turmaEDTI.adicionarAluno(bruno);
        turmaEDTI.adicionarAluno(julieta);
        turmaEDTI.adicionarAluno(capitú);

        turmaBIADM.adicionarAluno(peterson);
        turmaBIADM.adicionarAluno(ian);
        turmaBIADM.adicionarAluno(luana);
        turmaBIADM.adicionarAluno(romeu);
        turmaBIADM.adicionarAluno(maria);
        turmaBIADM.adicionarAluno(bentinho);

        // Imprimir as turmas
        turmaPOOTI.imprimirTurma();
        turmaEDTI.imprimirTurma();
        turmaBIADM.imprimirTurma();
    }
}