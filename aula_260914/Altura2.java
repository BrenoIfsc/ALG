// em centimetros
final double POLEGADA = 2.54;
final double PE = 12 * POLEGADA;

void main() {
    String entrada = IO.readln("Altura em metros: ");

    double metros = Double.parseDouble(entrada);
    double centimetros = metros * 100.0;

    int pes =  (int) Math.floor(centimetros / PE);
    int polegadas = (int) ((centimetros % PE) / POLEGADA) ;


    IO.println(String.format("Altura em pes e polegadas: %d'%d\"", pes, polegadas));
}