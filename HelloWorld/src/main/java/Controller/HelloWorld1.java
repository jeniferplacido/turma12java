package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld1 {
	
	@GetMapping
	public String hello() {
		return "Eu utilizei a Persistência e Atenção aos Detalhes";
	}


}
