package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Friend;
import Repositories.FriendRepo;

public class FriendServiceImpl implements FriendService{
    
    @Autowired
    private FriendRepo friendRepo;

    @Override
    public List<Friend> getAllFriends() {
        return friendRepo.findAll();
    }
}
