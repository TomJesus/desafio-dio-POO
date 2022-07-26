package br.com.dio.desafio.dominio;

import java.time.LocalDate;
       // Herdando da classe conteudo
public class Mentoria extends Conteudo{

    private LocalDate data;

    //Calculo de XP
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    // criando construtor
    public Mentoria() {
    }

     //Getter and setter de data ( alt+insert)
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Criando toString( alt + insert)
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

