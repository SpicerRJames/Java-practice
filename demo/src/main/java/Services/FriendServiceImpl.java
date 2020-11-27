package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Friend;
import Repositories.FriendRepo;

@Service
public class FriendServiceImpl implements FriendService{
    
    @Autowired
    private FriendRepo friendRepo;

    @Override
    public List<Friend> getAllFriends() {
        return friendRepo.findAll();

    @Override
    public void saveFriend(Friend friend) {
        this.friendRepo.save(friend);
    }
    }
}
