package com.dio.gof.service;

import com.dio.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 *
 * @author PauloProgram
 */

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
