package testarjar;


import br.com.vinicius.metodos.Calculo;


class Aluno {

}

public class TestarJar {

    public static void main(String[] args) {
       Calculo a = new Calculo();
        System.out.println( a.deltaEquacao2(" 1", "-3", "-4"));
        System.out.println(a.formatarEquacacao(" 1", "-3", "-4"));
       // System.out.println(a.testarDelta(" 1", "-3", "-4"));
        System.out.println(a.primeiraRaiz(" 1", "-3", "-4"));
        System.out.println(a.segundaRaiz(" 1", "-3", "-4"));
        
        
        //System.out.println(a.formatarEquacacao("2.5", "4", "2"));
    }

}
