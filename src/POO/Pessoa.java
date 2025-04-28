package POO;

public class Pessoa {
    //Atributos -> Propriedades
   private String nome ;
   private Integer idade;
   private Double altura;
   private Double peso;

//   public Pessoa(){
//       this.nome = "Sem nome";
//       this.idade = 0;
//       this.altura = 0.0;
//       this.peso = 0.0;
//   }

    public Pessoa(String nome,Integer idade, Double altura, Double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

   //Métodos -> Ações
    //setters e getters (Setters para colocar o valor e getters para pegar )
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getAltura() {
        return altura;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPeso() {
        return peso;
    }

    public Double calcularIMC(){
        return peso / (altura * altura);
    }
    
    public String classificacaodeIMC(){
        double imc = calcularIMC();
        
        if (imc<18.5){
            return "Abaixo do peso";
        } else if (imc<25){
            return "Peso normal";
        }else if (imc<30){
            return "Sobrepeso";
        }else {
            return "Obesidade";
        }
    }

    public String apresentar(){
        return "Olá , me chamo "+nome+",tenho "+idade+" anos e peso "+peso+" kg e tenho "+altura+" m de altura !";
    }

}
