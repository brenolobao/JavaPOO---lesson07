
package com.mycompany.aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //metodos getters e setters;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria); 
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(this.getPeso() < 52.2f){
            this.setCategoria("invalido");
        }else if(this.getPeso() <= 70.3f){
            this.setCategoria("Leve");
        }else if(this.getPeso() <= 83.9f ){
            this.setCategoria("Médio");
        }else if(this.getPeso() <= 120.2f){
            this.setCategoria("Pesado");
        }else{
            this.setCategoria("invalido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    // metodo construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,  int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    
    // metodos
    public void apresentar(){
        System.out.println("O lutador é " + this.getNome() +
                "\n tem " + this.getIdade() + " anos" + 
                "\n pesando " + this.getPeso() + "kg" +  
                "\n nascido no(a) " + this.getNacionalidade() + 
                "\n na categoria " + this.getCategoria() + 
                "\n tendo " + this.getVitorias() + " Vitorias, " + 
                this.getDerrotas() + " Derrotas e " + 
                this.getEmpates() + " Empates");
    }
    
    public void status(){
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    
    
}
