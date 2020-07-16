package Programem.Forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MensagemController {
    
   @GetMapping("/mensagem")
   public String formMensagem(Model model){
       model.addAttribute("mensagem", new Mensagem());
       return "mensagem";

   }

   @PostMapping("/mensagem")
    public String mensagemSubmit(@ModelAttribute Mensagem mensagem){
    return "resposta";
   }
   
}