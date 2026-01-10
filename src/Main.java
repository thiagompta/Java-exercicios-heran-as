import br.com.exercicio1.ConversorMoeda;
import br.com.exercicio2.CalculadoraSalaRetangular;
import br.com.exercicio3.TabuadaMultiplicacao;
import br.com.exercicio4.ConversorTemperaturaPadrao;
import br.com.exercicio5.Livro;
import br.com.exercicio5.ProdutoFisico;
import br.com.exercicio6.Produto;
import br.com.exercicio6.Servico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.ConverterDolarParaReal(1);
        //Exercicio 2
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 7);
        calculadora.calcularPerimetro(4, 8);
        //Exercicio 3
        TabuadaMultiplicacao tabuadas = new TabuadaMultiplicacao();
        tabuadas.mostrarTabuada(7);
        //Exercicio 4
        ConversorTemperaturaPadrao converter = new ConversorTemperaturaPadrao();
        converter.celsiusParaFahrenheit(0);
        converter.fahrenheitParaCelsius(32);
        //Exercicio 5
        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();
        livro.calcularPrecoFinal(30, 10, 0);
        produto.calcularPrecoFinal(20, 2, 13);
        //Exercicio 6
        Produto produto2 = new Produto();
        Servico servico2 = new Servico();
        produto2.precoTotal(23, 3, 0);
        servico2.precoTotal(50,0,5);

    }


}