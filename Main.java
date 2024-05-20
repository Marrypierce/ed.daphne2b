//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    public static void main(String[] args) {
        List <String> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <3;i++);{
            System.out.println("digite o nome");
            alunos.add(sc.nextLine());
            alunos.add(sc.nextLine());
            alunos.add(sc.nextLine());

        }
        List <Integer> m = new ArrayList<>();
        System.out.println("digite o número da matrícula");
        {{
            m.add(sc.nextInt());
            m.add(sc.nextInt());
            m.add(sc.nextInt());
        }};
        List <Integer> data = new ArrayList<>();
        for(int i =0; i < 3;i++);{
            System.out.println("digite as data de nascimento");
            {{
                data.add(sc.nextInt());
                data.add(sc.nextInt());
                data.add(sc.nextInt());
            }}
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
};