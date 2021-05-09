package com.springrest.springrest.entities;

public class Friend {

	private int id;
	private String first_name;
	private String last_name;
	private String favorite_phrase;

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(int id, String first_name, String last_name, String favorite_phrase) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.favorite_phrase = favorite_phrase;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", favorite_phrase="
				+ favorite_phrase + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFavorite_phrase() {
		return favorite_phrase;
	}

	public void setFavorite_phrase(String favorite_phrase) {
		this.favorite_phrase = favorite_phrase;
	}

}
