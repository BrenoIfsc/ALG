void main() {
    IO.print("Qual a altura (m)? ");
    double altura = Double.parseDouble(IO.readln());

    IO.print("Qual a largua (m)? ");
    double largura = Double.parseDouble(IO.readln());

    IO.print("Qual a profundidade (m)? ");
    double profundidade = Double.parseDouble(IO.readln());

    double volume = altura * largura * profundidade;
    double area = 2 * (altura * largura + largura * profundidade + altura * profundidade);

    IO.println("Área: " + area + "m², Volume: " + volume + "m³");
}