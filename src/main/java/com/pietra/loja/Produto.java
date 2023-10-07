package com.pietra.loja;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    int codigo;

    String descricao;

    double preco;

    int estoque;

    public Produto() {
    }

    public Produto(int codigo, String descricao, double preco, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(int codigo, int estoque) {
        this.codigo = codigo;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return estoque;
    }

    public void setQtdEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "{ " + codigo + ", " + descricao + ", " + preco + ", " + estoque + " }";
    }
}
