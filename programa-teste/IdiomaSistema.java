import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
    Locale loc = Locale.getDefault();//pega o idioma do sistema operacional
        System.out.println("Seu sistema está em: " + loc.getDisplayLanguage());
    }
    }
