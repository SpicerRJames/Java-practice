package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Model.Friend;
import Services.FriendService;

@Controller
public class FriendController {
    
    @Autowired
    private FriendService friendService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("listFriends", friendService.getAllFriends());
        return "index";
    }

   

}
