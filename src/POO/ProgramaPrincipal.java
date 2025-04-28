package POO;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        //Instanciando a pessoa -> criar(new)

//        Pessoa pessoa1 = new Pessoa();

//        pessoa1.setNome("Lucas");
//        pessoa1.setIdade(20);
//        pessoa1.setAltura(1.80);
//        pessoa1.setPeso(70.0);
//
//
//        System.out.println(pessoa1.getNome()+ " "+
//                pessoa1.getIdade()+ " "+
//                pessoa1.getAltura()+ " "+
//                pessoa1.getPeso());

        Pessoa pessoa2 = new Pessoa("Lucas", 20, 1.80, 70.0);

        System.out.println(pessoa2.getNome()+ " "+
                pessoa2.getIdade()+ " "+
                pessoa2.getAltura()+ " "+
                pessoa2.getPeso());

        System.out.println(pessoa2.calcularIMC());
        System.out.println(pessoa2.classificacaodeIMC());
        System.out.println(pessoa2.apresentar());
    }
}
