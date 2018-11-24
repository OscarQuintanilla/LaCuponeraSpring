package sv.edu.udb.NoFunciona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.udb.NoFunciona.repository.RubrosRepository;
import sv.edu.udb.NoFunciona.repository.ClientesRepository;
import sv.edu.udb.NoFunciona.repository.PromocionesRepository;
import sv.edu.udb.NoFunciona.repository.EmpresasRepository;
import sv.edu.udb.NoFunciona.repository.UsuariosRepository;

@Controller
@RequestMapping("/prueba")
public class AdministradorController {

	@Qualifier("EmpresasRepository")
	EmpresasRepository empresasRepository;

	@Autowired
	@Qualifier("UsuariosRepository")
	UsuariosRepository usuariosRepository;

	@Autowired
	@Qualifier("ClientesRepository")
	ClientesRepository clientesRepository;
	
	@Autowired
	@Qualifier("PromocionesRepository")
	PromocionesRepository promocionesRepository;
	
	@Autowired
	@Qualifier("RubrosRepository")
	RubrosRepository rubrosRepository;
	
	@GetMapping("/metodo")
	public String metPrueba(Model model) {
		model.addAttribute("lista", rubrosRepository.findAll());
		
		return "prueba";
	}
	
	
	
	
	
	
	
	
	
	
}
