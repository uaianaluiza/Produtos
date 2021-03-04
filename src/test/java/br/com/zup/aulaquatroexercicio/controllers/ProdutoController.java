package br.com.zup.aulaquatroexercicio.controllers;

import br.com.zup.aulaquatroexercicio.model.Produto;
import br.com.zup.aulaquatroexercicio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping( " produtos / " )


public class ProdutoController {


        @Autowired
        private ProdutoService produtoService;

        @PostMapping
        public Produto adicionarProduto (@RequestBody Produto  produto ) {
            produtoService . adicionarProduto (produto);
            return produto;
        }

        @GetMapping
        public List<Produto> listarProdutos () {
            return ProdutoService . getProdutos();
        }
    }


