package io.github.Bertidev.spotify_recommender;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    String showUserPage(Model modelo, OAuth2AuthenticationToken token) {
        OAuth2User user = token.getPrincipal();
        String userName = user.getAttribute("display_name");
        modelo.addAttribute("username", userName);
        return "user";
    }
}
