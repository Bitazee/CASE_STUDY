package com.github.perscholas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration-confirmation")
public class RegistrationConfirmationController {

    @GetMapping
    String getView(Model model){
        return "registrationConfirmation"; //returns a view from the JSP
    }
}
