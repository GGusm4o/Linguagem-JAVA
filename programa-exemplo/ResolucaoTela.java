import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize(); // Obtem a dimensão da tela
        int width = screenSize.width;   // Largura da tela
        int height = screenSize.height; // Altura da tela
        System.out.println("Sua resolução é: " + width + " x " + height);
    }
}