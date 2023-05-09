package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    

    public Pessoa(String nome, int i){
    	setNome(nome);
        setIdade(idade);
    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;    
        }
      
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Ol� eu sou o " + nome + ", e tenho " + idade + " anos.";
    }

    

}
