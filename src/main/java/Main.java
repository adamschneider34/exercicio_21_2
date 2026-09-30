import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int n = 1; n <= 1000; n++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
            soma = numero + soma;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}