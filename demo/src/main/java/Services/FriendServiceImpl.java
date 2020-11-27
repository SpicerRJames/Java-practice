package Services;

import java.util.List;
import java.util.Optional;

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
    }

    @Override
    public void saveFriend(Friend friend) {
        this.friendRepo.save(friend);
    }

    @Override
    public Friend getFriendById(long id) {
        Optional < Friend > optional = friendRepo.findById(id);
        Friend friend = null;
        if (optional.isPresent()) {
            friend = optional.get();
        } else {
            throw new RuntimeException(" Friend not found for id :: " + id);
        }
        return friend;
    }

    @Override
    public void deleteFriendById(long id) {
        // TODO Auto-generated method stub

    }
    
}
