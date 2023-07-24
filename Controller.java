package ineuron.assessment.Q21.question21.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ineuron.assessment.Q21.question21.Entity.Contact;
import ineuron.assessment.Q21.question21.services.ContactService;

@RestController
public class Controller {
	
	@Autowired
	ContactService contactService;

	@PostMapping("/postContact")
	public ResponseEntity<Contact> post(@RequestBody Contact contact) {
		
		Contact c=null;
		
		c= contactService.post(contact);
		
		
		if(c==null) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
			
		}
		
		return ResponseEntity.of(Optional.of(c));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Contact>> getAll(){
		
		List<Contact> l =null;
		
		l=contactService.getAll();
		
		if(l==null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		
		return ResponseEntity.of(Optional.of(l));
		
	}
	
}
