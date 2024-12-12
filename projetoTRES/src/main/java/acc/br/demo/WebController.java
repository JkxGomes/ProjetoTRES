package acc.br.demo;

import org.springframework.beans.factory.anotation.Autowired;






@Controller
public class webController {
	@Autowired
	public ScoreRepository ScoreRepo;
	
	@ResponseBody
	@GetMapping("/score")
	public Score getScore() {
		Score score;
		try {
			score = scoreRepo.findById(new Integer(1)).get();
		}
		catch(Exception e) {
			score = new Score (0,0,0);
			scoreRepo.save(score);
		}
		return score;
		}
	@GetMapping("teste")
	public String teste (RequestParam(name="escolha")String aEscolha, model Model) {
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

	