import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:

        for(int i = 0; i<nomesFila.length; i++) {
            nomesFila[i] = nome.nextLine();
        }

        System.out.println(nomesFila[0] + " - esta na posicao: 1");
        System.out.println(nomesFila[1] + " - esta na posicao: 2");
        System.out.println(nomesFila[2] + " - esta na posicao: 3");
    }
}