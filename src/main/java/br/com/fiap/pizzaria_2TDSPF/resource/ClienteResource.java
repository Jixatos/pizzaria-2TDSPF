package br.com.fiap.pizzaria_2TDSPF.resource;

import br.com.fiap.pizzaria_2TDSPF.entity.Cliente;
import br.com.fiap.pizzaria_2TDSPF.repositorio.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    private ClienteRepository repo;


    @GetMapping
    public List<Cliente> findAll() {

        return repo.findAll();
    }
}
