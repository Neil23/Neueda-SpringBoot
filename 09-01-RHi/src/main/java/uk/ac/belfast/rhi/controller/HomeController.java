package uk.ac.belfast.rhi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfast.rhi.domain.Client;
import uk.ac.belfast.rhi.repository.ClientRepository;



@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	ClientRepository clientRepository;
	public HomeController(ClientRepository ClientRepository) 
	{
		super();
		this.clientRepository= clientRepository;
	}




	@GetMapping("/")
	public String home (Model model) {

		return "Home";            
	}

	@GetMapping("/client")
	public String passenger (Model model) {
		model.addAttribute("clients", clientRepository.findAll());
		return "client";            
	}


	@GetMapping("/client/view/{clientId}")

	public String viewClient(@PathVariable("clientId")Integer clientId, Model model) {
		model.addAttribute("pageTitle", "Client");
		model.addAttribute("client", clientRepository.findOne(clientId));
		return "ViewClient";

	}



	@GetMapping("/client/delete/{clientId}")
	public String deleteClient(@PathVariable("clientId")Integer clientId,
			RedirectAttributes redirectAttrs){

		clientRepository.delete(clientId);
		redirectAttrs.addFlashAttribute("message", "Client has left");

		return "redirect:/client";

	}

	@GetMapping("/client/add")
	public String createClient(Model model) {
		model.addAttribute("pageTitle", "Add Client");
		model.addAttribute("client", new Client());
		return "EditClient";

	}

	@GetMapping("/client/edit/{clientId}")

	public String editClient(@PathVariable ("clientId")Integer clientId, Model model) {

		model.addAttribute("pageTitle", "Edit Client");
		model.addAttribute("client", clientRepository.findOne(clientId));
		return "EditClient";

	}
	@PostMapping("/client/save")
public String saveclient(@Valid Client client, BindingResult bindingResult, Model model) {
if(bindingResult.hasErrors()) {

		return "EditClient";
	}else {
		Client savedClient = clientRepository.save(client);
		return "redirect:/client/view/" + savedClient.getClientId();




	}

	}
	
}

	

