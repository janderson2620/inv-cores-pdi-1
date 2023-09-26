package main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



import static methods.InverterCores.inverterCores;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage bandas = ImageIO.read(
                new File("C:\\Users\\jande\\IdeaProjects\\project-inv-cores\\src\\imagens\\logoOriginal\\sombrinhas.jpg")
        );
        inverterCores(bandas);

    }
}

