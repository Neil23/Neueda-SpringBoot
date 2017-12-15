package uk.ac.belfast.rhi.service;

import uk.ac.belfast.rhi.domain.Client;

public interface ClientRestService {

       Iterable<Client> list();
       
       Client create (Client client);
       
       Client read (Integer clientId);
       
       Client update (Integer clientId, Client client);
       
       void delete(Integer clientId);
       
}
