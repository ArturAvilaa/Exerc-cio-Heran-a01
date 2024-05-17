
abstract class RetanguloDecorator {
    protected String texto;

    public RetanguloDecorator(String texto) {
        this.texto = texto;
    }

    public abstract void desenhar();
}

class RetanguloBordasArredondadas extends RetanguloDecorator {
    public RetanguloBordasArredondadas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("╭───────────────╮");
        System.out.println("│               │");
        System.out.println("│   " + texto + "   │");
        System.out.println("│               │");
        System.out.println("╰───────────────╯");
    }
}

class RetanguloLinhasDuplas extends RetanguloDecorator {
    public RetanguloLinhasDuplas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("╔═══════════════╗");
        System.out.println("║               ║");
        System.out.println("║   " + texto + "   ║");
        System.out.println("║               ║");
        System.out.println("╚═══════════════╝");
    }
}

class RetanguloASCIIArt extends RetanguloDecorator {
    public RetanguloASCIIArt(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("   /¯¯¯¯¯¯¯¯¯¯¯¯¯\\");
        System.out.println("  |               |");
        System.out.println("  |   " + texto + "   |");
        System.out.println("  |               |");
        System.out.println("   \\_____________/");
    }
}

class RetanguloColorido extends RetanguloDecorator {
    public RetanguloColorido(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("\u001B[44m\u001B[30m███\u001B[0m");
        System.out.println("\u001B[44m\u001B[30m█\u001B[0m " + texto + " \u001B[44m\u001B[30m█\u001B[0m");
        System.out.println("\u001B[44m\u001B[30m███\u001B[0m");
    }
}

public class Main {
    public static void main(String[] args) {
        RetanguloDecorator retangulo1 = new RetanguloBordasArredondadas("Retângulo com bordas arredondadas");
        RetanguloDecorator retangulo2 = new RetanguloLinhasDuplas("Retângulo com linhas duplas");
        RetanguloDecorator retangulo3 = new RetanguloASCIIArt("Retângulo com ASCII art");
        RetanguloDecorator retangulo4 = new RetanguloColorido("Retângulo colorido");

        retangulo1.desenhar();
        System.out.println();
        retangulo2.desenhar();
        System.out.println();
        retangulo3.desenhar();
        System.out.println();
        retangulo4.desenhar();
    }
}
