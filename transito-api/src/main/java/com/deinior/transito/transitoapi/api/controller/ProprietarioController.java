package com.deinior.transito.transitoapi.api.controller;
import com.deinior.transito.transitoapi.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class ProprietarioController {

   @GetMapping("/proprietarios2")
   public List<Proprietario> listar(){

       var proprietario1 = new Proprietario();
       proprietario1.setId(1L);
       proprietario1.setNome("João");
       proprietario1.setTelefone("555558");
       proprietario1.setEmail("deinior@ouutlook.com");

       var proprietario2 = new Proprietario();
       proprietario2.setId(2L);
       proprietario2.setNome("Deinior");
       proprietario2.setTelefone("555551");
       proprietario2.setEmail("deinior1@ouutlook.com");

       return Arrays.asList(proprietario1,proprietario2);
   }

}
