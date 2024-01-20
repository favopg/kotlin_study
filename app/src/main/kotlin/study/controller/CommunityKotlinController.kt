package study.controller

import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.SessionAttributes

@Controller
@SessionAttributes(names = ["communityName","authentication"])
class CommunityKotlinController {

    @GetMapping("/login/community")
    fun login(authentication : Authentication, model : Model) :String {
        model.addAttribute("communityName", "")
        model.addAttribute("authentication", authentication)

        return "login/login_community"
    }

}