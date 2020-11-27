package Services;

import java.util.List;
import Model.Friend;

public interface FriendService {
    List<Friend> getAllFriends();
    void saveFriend(Friend friend);
    Friend getFriendById(long id);
    void deleteFriendById(long id);
}
//test