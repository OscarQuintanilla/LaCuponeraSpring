package sv.edu.udb.NoFunciona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.udb.NoFunciona.repository.RubrosRepository;

@Controller
@RequestMapping("/prueba")
public class PruebaController {

	@Autowired
	@Qualifier("RubrosRepository")
	RubrosRepository rubrosRepository;
	
	@GetMapping("/metodo")
	public String metPrueba(Model model) {
		model.addAttribute("lista", rubrosRepository.findAll());
		
		return "prueba";
	}
	
}
