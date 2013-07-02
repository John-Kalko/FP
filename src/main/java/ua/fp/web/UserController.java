package ua.fp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.fp.domain.UserAccountEntity;
import ua.fp.service.UserAccountService;
import ua.fp.service.impl.UserAccountServiceImpl;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userAccountServiceImpl")
    private UserAccountService uaService;

    @RequestMapping(value = "/index")
    public String indexPage() {
          return "/start";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserAccountEntity e,
                             BindingResult result) {

        this.uaService.addUser(e);

        return "redirect:/index";
    }

    @RequestMapping(value = "/getUser50")
    public String getUser() {

        String result = this.uaService.findUser50().getEmail();

        return "redirect:/index";
    }

    @RequestMapping(value = "/addUser")
    public String addUser() {

        this.uaService.addUser();

        return "redirect:/index";
    }
}
