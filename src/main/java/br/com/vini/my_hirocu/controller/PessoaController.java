package br.com.vini.my_hirocu.controller;


import br.com.vini.my_hirocu.model.Pessoa;
import br.com.vini.my_hirocu.repository.PessoaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//@Controller
@RestController
public class PessoaController {


    private PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;

    }

    @GetMapping("/listar/pessoas")
    public @ResponseBody List<Pessoa> ListarPessoas(Model model){

        return pessoaRepository.findAll();


    }

    @PostMapping("/salvar/pessoa")
    public Pessoa  salvar(@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
        return pessoa;
    }




}
