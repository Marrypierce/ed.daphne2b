import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        //pilha
          Queue <String> carros = new LinkedList<>();
        carros.add("honda");
        carros.add("empala");
        carros.add("audi");
        carros.add("BMW");

        System.out.println("topo:" + carros.poll());
        System.out.println("o elemento do topo é:" + carros.peek());
        System.out.println(carros.isEmpty()?"não tem":"tem carro");
        
        //fila

        Stack  <String> carrosp = new Stack<>();
        carrosp.push("Chevrolet Onix");
        carrosp.push("hyundai HB20");
        carrosp.push("agen gol");
        carrosp.push("fiat mobi");
        System.out.println("topo da fila:" + carrosp.pop());
        System.out.println("topo:" + carrosp.peek());
        System.out.println(carrosp.isEmpty()?"vazia":"tem carro");


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.


    }
}
