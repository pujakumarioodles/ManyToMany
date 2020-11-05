package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int id;
	private String project;
	
	@ManyToMany(mappedBy="projects",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<User> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", project=" + project + ", users=" + users + "]";
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 {
    "id": 3,
    "name": "anuska",
    "emailid": "anuska@gmail.com",
    "password": "bhhh",
    "salary": 400,
    "roles": [
        {
            "id": 4,
            "role": "user",
            "user": null
        }
    ]
}
	 */

}
