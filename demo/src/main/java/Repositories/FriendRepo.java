package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Friend;

@Repository
public interface FriendRepo extends JpaRepository<Friend, Long> {
    
}
