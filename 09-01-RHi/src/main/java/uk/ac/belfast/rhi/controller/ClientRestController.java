

 

package uk.ac.belfast.rhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfast.rhi.domain.Client;
import uk.ac.belfast.rhi.service.ClientRestService;

@RestController
@RequestMapping("/api/client")

public  class ClientRestController{

       @Autowired
       ClientRestService clientRestService;


       public ClientRestController(ClientRestService clientRestService) {
              super();
              this.clientRestService = clientRestService;
       }


       @GetMapping("/")
       public Iterable<Client>list(){
              return clientRestService.list();
       }

       @PostMapping("/")
       public Client create(@RequestBody Client client){
              return clientRestService.create(client);
              
       }

       @GetMapping("/{clientId}")
       public Client read(@PathVariable("clientId")Integer clientId){
              return clientRestService.read(clientId);
       }

       @DeleteMapping("/{clientId}")
       public void delete(@PathVariable("clientId")Integer clientId){
              clientRestService.delete(clientId);
       }

       

       }

