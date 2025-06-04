public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno("João", "001122", "Rua...", 100);

        Professor p = new Professor("Lucas", "336644", "Outra rua...", 10000, "Estrutura de Dados");

        System.out.println("Aluno:");

        System.out.println(a.getNome());
        System.out.println(a.getCPF());

        System.out.println(a.getNota());

        System.out.println("\nProfessor:");

        System.out.println(p.getCPF());
        System.out.println(p.getNome());
        System.out.println(p.getSalario());
        System.out.println(p.getDisciplina());
    }
}