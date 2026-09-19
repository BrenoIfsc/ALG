
final int FREQUENCIA_MINIMA = 75;
final int MEDIA_MINIMA = 6;

void main() {
    boolean aprovado;
    float totalNotas;

    String linha = IO.readln("Entre com P1 e R1: ");
    String[] partes = linha.split(" ");

    totalNotas = Math.max(Float.parseFloat(partes[0]), Float.parseFloat(partes[1]));

    linha = IO.readln("Entre com P2 e R2: ");
    partes = linha.split(" ");

    totalNotas += Math.max(Float.parseFloat(partes[0]), Float.parseFloat(partes[1]));

    linha = IO.readln("Entre com P3 e R3: ");
    partes = linha.split(" ");

    totalNotas += Math.max(Float.parseFloat(partes[0]), Float.parseFloat(partes[1]));

    float media = totalNotas / 3;
    float mediaArred = Math.round(media);

    linha = IO.readln("Entre com a frequência (em %): ");
    float freq = Float.parseFloat(linha);

    IO.println(String.format("Média: %.1f", media));
    IO.println(String.format("Média arredondada: %d", (int) mediaArred));

    aprovado = mediaArred >= MEDIA_MINIMA && freq >= FREQUENCIA_MINIMA;

    IO.println(String.format("Aprovado: %b", aprovado));
    


}