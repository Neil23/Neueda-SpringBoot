package uk.ac.belfast.consituencies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfast.consituencies.domain.AllMemberList;
import uk.ac.belfast.consituencies.domain.Member;


@Controller
@RequestMapping("")
public class ConstituencyController
{
	
	public ConstituencyController()
	{
		
	}
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Events");
		
		
		return "Home";
	}
	
	@GetMapping("/constituency/{constituencyId}")
	public String singleEvent(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");
		
		
		String membersUrl = "https://api.myjson.com/bins/y888n";
		
		RestTemplate restTemplate = new RestTemplate();
		AllMemberList members = restTemplate.getForObject(membersUrl, AllMemberList.class);
		ArrayList<Member> requestedMembers = new ArrayList<Member>();


		for(Member member: members.getAllMembers())
		{
			
			if (member.getConstituencyId().equals(constituencyId))
			{
				
				requestedMembers.add(member);
			}

		}
			
		model.addAttribute("constituency", requestedMembers.get(0).getConstituencyName());
		model.addAttribute("members", requestedMembers);
		return "Constituencies";
	}
}