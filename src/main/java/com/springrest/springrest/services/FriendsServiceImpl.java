package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Friend;

@Service
public class FriendsServiceImpl implements FriendsService {

	List<Friend> list;

	public FriendsServiceImpl() {

		list = new ArrayList<>();
		list.add(new Friend(1, "Chandler", "Bing", "Could I BE any funnier"));
		list.add(new Friend(2, "Monica", "Geller", "I know!!"));

	}

	@Override
	public List<Friend> getFriends() {

		return list;
	}

	@Override
	public Friend getFriend(int friendId) {

		Friend f = null;
		for (Friend friend : list) {
			if (friend.getId() == friendId) {
				f = friend;
				break;
			}
		}
		return f;
	}

	@Override
	public List<Friend> addFriends(List<Friend> friends) {

		list.addAll(friends);
		return friends;
	}

	@Override
	public List<Friend> updateFriends(List<Friend> friends) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend deleteFriend(int friendId) {
		// TODO Auto-generated method stub
		return null;
	}

}
