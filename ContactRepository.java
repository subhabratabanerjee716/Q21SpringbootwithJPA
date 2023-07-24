package ineuron.assessment.Q21.question21.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ineuron.assessment.Q21.question21.Entity.Contact;

@Component
public interface ContactRepository extends CrudRepository<Contact,Integer> {

	public List<Contact> findAll();
	
}
