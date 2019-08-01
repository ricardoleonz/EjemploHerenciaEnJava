package constantes;

public enum Mensajes {

    MENSAJE_ENTRADA("Ingrese temperatura en centigrados a convertir en Farenheit: "),
    MENSAJE_CENTIGRADO("°C"),
    MENSAJE_FARENHEIT("°F"),
    MENSAJE_RESULTADO("La conversion de "),
    MENSAJE_ASIGNAR(" es ");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
