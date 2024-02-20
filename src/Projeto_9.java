import javax.swing.*;

public class Projeto_9 {

    public static void main(String args[]){

    int nun1 = 10;
    int nun2 = nun1;


    long nun3 = 1037458795l;
    int nun4 = (int) nun3;

    int idade1 = Integer.valueOf(21);
    long idade2 = Long.valueOf(idade1);//Variavel Wrapprs

    long idade3 = Long.valueOf(3123);
    int idade4 = Integer.valueOf((int) idade3);// Wrapprs Usando o casting


        System.out.println("Primitivo:" + nun2);
        System.out.println("Casting:" + nun4);
        System.out.println("Wrapprs:" + idade2);
        System.out.println("Casting:" + idade4);
}




}

