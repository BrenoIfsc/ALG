void main() {
    IO.print("Digite seu nome (verdadeiro): ");
    String nome = IO.readln();
    IO.println("Olá, " + nome + "!");
    
    IO.print("Digite sua idade: ");
    int idade = Integer.parseInt(IO.readln());
    IO.println("Daqui 20 anos você terá " + (idade + 20) + " de idade");

    for (int i = 0; i < 100_000_000; i ++) {
        IO.print("B) ");
    }
}