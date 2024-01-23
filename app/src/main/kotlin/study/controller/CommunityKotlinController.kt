package study.controller

import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.SessionAttributes
import study.front.CommunityScreen

@Controller
@SessionAttributes(names = ["communityName","authentication"])
class CommunityKotlinController {

    @GetMapping("/login/community")
    fun login(authentication : Authentication, model : Model) :String {
        model.addAttribute("communityName", "")
        model.addAttribute("authentication", authentication)

        var communityScreen = CommunityScreen()
        model.addAttribute("cardHeader", communityScreen.init())
        model.addAttribute("cardBody", communityScreen.cardBody())

        System.out.println("初めてのCI登録実施のためのコード作");

        return "login/login_community"
    }

}