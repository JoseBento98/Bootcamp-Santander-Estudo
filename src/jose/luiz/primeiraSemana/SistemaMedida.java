package jose.luiz.primeirasemana;

public class SistemaMedida {
    public static void main(String[] args) {
        String silga = "M";
        switch (silga) {
            case "P":
            System.out.println("PEQUENO");
                break;
            case "M":
            System.out.println("MEDIO");
                break;
            case "G":
            System.out.println("GRANDE");
                break;
        
            default:
            System.out.println("INDEFINIDO");
                break;
        }

    }
}
