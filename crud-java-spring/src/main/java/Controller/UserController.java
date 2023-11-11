package Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Repository.UserRepository;
import br.com.Gustavo.User;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	
	UserRepository repository;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return repository.findAll();
	}
	@GetMapping("/user")
	public User getUserById(@PathVariable Long id) {
	return repository.getOne(id);
	}
	
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
		
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
