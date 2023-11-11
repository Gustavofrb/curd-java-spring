package Controller;
	import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

	@org.springframework.web.bind.annotation.ControllerAdvice
	public class ControllerAdvice {

	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	    public String handleException(Exception e, Model model) {
	        // Adicione informações de erro ao modelo, se necessário
	        model.addAttribute("error", e.getMessage());
	        return "error";
	    }
	}



