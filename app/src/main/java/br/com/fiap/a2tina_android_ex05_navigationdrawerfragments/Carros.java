package br.com.fiap.a2tina_android_ex05_navigationdrawerfragments;

import java.io.Serializable;

/**
 * Created by fernando.oliveira on 24/03/2017.
 */

public class Carros implements Serializable{
    private String nome;
    private int ano;
    private String descricao;
    private int imagem;

    public Carros(String nome, int ano, String descricao, int imagem) {
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public Carros() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
