
package uk.ac.belfast.rhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfast.rhi.domain.Client;
import uk.ac.belfast.rhi.repository.ClientRepository;

@Service
public class 	ClientRestServiceImpl implements ClientRestService {

                @Autowired
                private ClientRepository clientRepository;
                
                
                public ClientRestServiceImpl(ClientRepository clientRepository) {
                                super();
                                this.clientRepository = clientRepository;
                }

                @Override
                public Iterable<Client> list() {
                                
                                return this.clientRepository.findAll();
                }

                @Override
                public Client create(Client client) {
                                
                                return this.clientRepository.save(client);
                }

                @Override
                public Client read(Integer clientId) {

                                return this.clientRepository.findOne(clientId);
                }

                @Override
                public Client update(Integer clientId, Client client) {

                                Client clientToUpdate = this.clientRepository.findOne(clientId);
                                return clientRepository.save(clientToUpdate);
                }

                @Override
                public void delete(Integer clientId) {
                                this.clientRepository.delete(clientId);

                }

}
