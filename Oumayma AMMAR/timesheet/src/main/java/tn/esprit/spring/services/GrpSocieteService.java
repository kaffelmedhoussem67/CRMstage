package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.GroupeSociete;
import tn.esprit.spring.entities.Societe;

public interface GrpSocieteService {
 public List<GroupeSociete> getAllGrp(GroupeSociete groupesociete);
 public GroupeSociete addGrpSociete (GroupeSociete groupesociete); 
}
