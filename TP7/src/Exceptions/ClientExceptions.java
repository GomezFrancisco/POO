package Exceptions;

public class ClientExceptions extends Exception{

    public static final String MSG_CUIT="CUIT invalido";
    public static final String MSG_CUIT2="El CUIT debe ser numerico";
    public static final String MSG_EMAIL="Email invalido, solo se acepta hotmail y gmail";
    public static final String MSG_Celular="Celular invalido, solo se aceptan numeros";
    public static final String MSG_Nombre="El nombre debe tener al menos 2 caracteres";
    public static final String MSG_Nombre2="El nombre no debe contener numeros";
    public static final String MSG_Client="El cliente no existe";
    private String name;

    public ClientExceptions(String name) {
        this.name=name;
    }
    public String toString() {
        return "Error: "+name;
    }
}