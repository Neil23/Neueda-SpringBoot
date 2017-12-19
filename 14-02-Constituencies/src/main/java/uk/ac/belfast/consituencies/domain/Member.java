package uk.ac.belfast.consituencies.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member {
	@JsonProperty("PersonId")
	private String personId;
	
	@JsonProperty("AffiliationId")
	private String affiliationId;
	
	@JsonProperty("MemberName")
	private String memberName;
	
	
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	
	@JsonProperty("MemberLastName")
	
	private String memberLastName;
	
	
	@JsonProperty("MemberSortName")
	private String memberSortName;
	
	@JsonProperty("Party")
	private String party;
	
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("constituencyName")
	private String constituencyName;
	
	//@JsonProperty("constituencyId")
	//private String constituencyId;
	




}