package br.com.zup.aulaquatroexercicio.service;

import br.com.zup.aulaquatroexercicio.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static List<Produto> produtos =  new ArrayList<>();

    public  void  adicionarProduto ( Produto  produto ) {
        produtos . add (produto);
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }
}

