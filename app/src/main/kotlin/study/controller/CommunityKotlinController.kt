package study.controller

import org.springframework.security.core.Authentication
import org.springframework.security.web.csrf.CsrfToken
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.SessionAttributes
import study.front.CommunityScreen
import javax.servlet.http.HttpServletRequest

@Controller
@SessionAttributes(names = ["communityName","authentication"])
class CommunityKotlinController {

    @GetMapping("/login/community")
    fun login(authentication : Authentication, model : Model, request : HttpServletRequest) :String {
        model.addAttribute("communityName", "")
        model.addAttribute("authentication", authentication)

        val token = request.getAttribute("_csrf") as CsrfToken

        val communityScreen = CommunityScreen()
        model.addAttribute("cardHeader", communityScreen.init())
        model.addAttribute("cardBody", communityScreen.cardBody("",token))

        return "login/login_community"
    }

}