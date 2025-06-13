package control;

public class LoginControler {

    String[][] usuarios = {
        {"fernando", "estrella22"}, {"paula", "paseo123"}, {"martin", "aurora56"},
        {"camila", "gatito_25"}, {"julian", "viaje!2023"}, {"valeria", "chocolate_99"},
        {"sergio", "laptop001"}, {"ines", "cieloVerde"}, {"miguel", "marDeLuz"},
        {"diana", "hojaAzul"}
    };

public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {

for (int i = 0; i < usuarios.length; i++) {
    if (usuarios[i][0].equals(EntradaUsuario) && usuarios[i][1].equals(EntradaContrasenna)) {
        return true; 
    }
}
return true; 
}
}