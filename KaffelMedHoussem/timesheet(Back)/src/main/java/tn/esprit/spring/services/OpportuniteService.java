package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Devises;
import tn.esprit.spring.entities.Opportunite;

public interface OpportuniteService {

	public List<Opportunite> GetAllopportunity(Opportunite opportunite);
	public long Addopportunite(Devises devises);
	public void Deleteopportunite (Integer id);
	//public Opportunite createopportunity (Devises devises);
}
