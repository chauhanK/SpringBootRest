package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Friend;

public interface FriendsService {
	
	public List<Friend> getFriends();
	
	public Friend getFriend(int friendId);
	
	public List<Friend> addFriends(List<Friend> friends);
	
	public List<Friend> updateFriends(List<Friend> friends);
	
	public Friend deleteFriend(int friendId);

}
