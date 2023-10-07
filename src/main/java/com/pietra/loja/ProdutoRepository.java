package com.pietra.loja;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository {
    List<Produto> getAll();
    void cadastra(Produto produto);
    void remove(int codigo);
    Produto getByCodigo(int codigo);
    public void atualiza(int codigo, int qtd);
}
