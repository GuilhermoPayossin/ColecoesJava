public class Aluno {

    private int rm;
    private String nome;
    private String curso;

    public Aluno(int rm, String nome, String curso) {
        this.rm = rm;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("RM:=%d | Aluno=%s | Curso=%s", rm, nome, curso);
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
