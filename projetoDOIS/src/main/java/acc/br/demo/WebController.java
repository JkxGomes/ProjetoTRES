package acc.br.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class webController {
	
	@GetMapping("/teste")
public String teste (@RequestParam(name="escolha")String aEscolha, Model Model) {
		String saida = "empate";
		if (aEscolha.equalsIgnoreCase("papel")) {
			saida = "ganhou";
		}
		if (aEscolha.equalsIgnoreCase("tesoura")) {
			saida = "perdeu";
	}
		model.addAttribute("saida", saida);
		model.addAttribute('aEscolha', aEscolha)
		return "resuiltado";
	}
	
}