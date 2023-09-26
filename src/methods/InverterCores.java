package methods;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InverterCores extends ExtrairCores {
    public static void inverterCores(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);


        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int imagemVermelha = 255 - cor.getRed();
                int imagemVerde = 255 - cor.getGreen();
                int imagemAzul = 255 - cor.getBlue();

                Color novaCor = new Color(imagemVermelha, imagemVerde, imagemAzul);

                novaImagem.setRGB(linha, coluna, novaCor.getRGB());
            }
        }

        String caminho = CAMINHO_PADRAO + "sombrinhas.jpg";

        ImageIO.write(novaImagem, "jpg", new File(caminho));

        JFrame janela = new JFrame("sombrinhas");
        janela.setSize(1366, 768);
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

