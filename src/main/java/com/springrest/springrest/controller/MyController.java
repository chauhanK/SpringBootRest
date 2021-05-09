package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Friend;
import com.springrest.springrest.services.FriendsService;

@RestController
public class MyController {

	@Autowired
	private FriendsService friendsService;

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}

	@GetMapping("/friends")
	public List<Friend> getFriends() {
		return this.friendsService.getFriends();

	}

	@GetMapping("/friends/{friendId}")
	public Friend getFriend(@PathVariable int friendId) {
		return this.friendsService.getFriend(friendId);

	}

	@PostMapping("/friends")
	public List<Friend> addFriends(@RequestBody List<Friend> friends) {
		return this.friendsService.addFriends(friends);

	}
	
	@PutMapping("/friends")
	public List<Friend> updateFriends(@RequestBody List<Friend> friends)
	{
		return this.friendsService.updateFriends(friends);
	}
	
	@DeleteMapping("/friends/{friendId}")
	public Friend deleteFriend(@PathVariable int friendId)
	{
		return this.friendsService.deleteFriend(friendId);
	}

}
