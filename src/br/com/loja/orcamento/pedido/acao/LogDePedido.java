package br.com.loja.orcamento.pedido.acao;

import br.com.loja.orcamento.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
