import java.util.Scanner;

public class treino{
    public static void main(String[] args) {
        Scanner digito= new Scanner(System.in);
        String nomeAluno;
        float nota1,nota2,media,recuperação;
        System.out.println(("Digite o nome do Aluno: "));
        nomeAluno=digito.nextLine();
        System.out.println("Digite nota 1: ");
        nota1=digito.nextFloat();
        System.out.println("Digite nota 2:");
        nota2=digito.nextFloat();
        media=(nota1+nota2)/2;
         if (media >=6) { 
         System.out.println(nomeAluno+ " foi aprovado com média: "+media);
         }else{
            if (media <=5.9)
            System.out.println(nomeAluno+ " está de recuperação com média: "+media);
            System.out.println("Informe a nota da recuperação: ");
            recuperação=digito.nextFloat();
            if (recuperação >=6) {
                System.out.println(nomeAluno+ " aprovado com média: "+ recuperação);
            } else{
                System.out.println(nomeAluno+ " reprovado com média: "+recuperação);
            }

        }
        
    }
}