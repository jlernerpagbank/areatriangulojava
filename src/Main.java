//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import model.Triangulo;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Triangulo tril = new Triangulo();

        tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo:")));
        tril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo")));

        JOptionPane.showMessageDialog(null, "A área do triangulo é " + tril.getArea());
    }
}