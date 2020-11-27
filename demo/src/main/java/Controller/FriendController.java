package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/showNewFriendForm")
    public String showNewFriendForm(Model model) {
        Friend friend = new Friend();
        model.addAttribute("friend", friend);
        return "new_friend";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Friend friend) {
        // save employee to database
        friendService.saveFriend(friend);
        return "redirect:/";
    }


}
