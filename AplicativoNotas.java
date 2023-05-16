import java.util.Stack;

public class AplicativoNotas {
    private Stack<String> notas;

    public AplicativoNotas() {
        notas = new Stack<>();
    }

    public void addNota(String nota) {
        notas.push(nota);
    }

    public void menuNotas() {
        Stack<String> notasInv = new Stack<>();
        for (String nota : notas) {
            notasInv.push(nota);
        }

        while (!notasInv.isEmpty()) {
            System.out.println(notasInv.pop());
        }
    }

    public static void main(String[] args) {
        AplicativoNotas app = new AplicativoNotas();

        app.addNota("Primeira nota");
        app.addNota("Segunda nota");
        app.addNota("Terceira nota");

        app.menuNotas();
    }
}
