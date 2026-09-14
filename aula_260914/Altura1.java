// em centimetros
final double POLEGADA = 2.54; 
final double PE = POLEGADA * 12; 

void main() {
    String entrada = IO.readln("Altura em pés e polegada: ");
    String[] partes = entrada.split(" ");

    int pes = Integer.parseInt(partes[0]);
    int polegadas = Integer.parseInt(partes[1]);

    double altura = (pes * PE + polegadas * POLEGADA) / 100.0;

    IO.println(String.format("Altura em metros: %.2fm", altura));
}