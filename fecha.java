public class fecha {
    public static void main(String[] args) {

        String fecha = "2022/06/19/imagen.jpg";

        String[] fechapartes = fecha.split("/");

        String mes = fechapartes[1];
        System.out.println("Mes: " + mes);

        String nombreArchivo = fechapartes[3];

        int indice = nombreArchivo.indexOf(".");

        String extension = nombreArchivo.substring(indice + 1);

        System.out.println("Extensión: " + extension);
    }
}