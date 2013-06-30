package ua.fp.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.fp.domain.UserAccountEntity;
import ua.fp.service.UserAccountService;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    @Inject
    private UserAccountService userAccountService;

    @RequestMapping(value = "/index")
    public String indexPage() {
          return "/start";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserAccountEntity e,
                             BindingResult result) {

        this.userAccountService.addUser(e);

        return "redirect:/index";
    }

    @RequestMapping(value = "/getUser50")
    public String getUser() {

        String result = this.userAccountService.findUser50().getEmail();

        return "redirect:/index";
    }
}
