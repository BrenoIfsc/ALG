final float SALARIO_FIXO = 2000.0f;
final float BONUS = 500.0f;
final float META_VENDAS = 10000.0f;
final float META_DESEMPENHO = 8;

final float COMISSAO_BASICA = 0.05f;
final float COMISSAO_META = 0.07f;

void main() {
    float totalVendas, desempenho;
    float remuneracao = SALARIO_FIXO;

    String linha = IO.readln("Entre com total de vendas (R$): ");
    totalVendas = Float.parseFloat(linha);

    if (totalVendas >= META_VENDAS) {
        remuneracao += COMISSAO_META * totalVendas;
    } else {
        remuneracao += COMISSAO_BASICA * totalVendas;
    }


    linha = IO.readln("Entre com a avaliação de desempenho(1-10): ");
    desempenho = Float.parseFloat(linha);

    if (desempenho >= META_DESEMPENHO) {
        remuneracao += BONUS;
    }

    IO.println(String.format("Remuneração: R$%.2f", remuneracao));
}