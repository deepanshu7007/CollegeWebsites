package com.College.CollegeWebsites.model;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    public Role(Long rolId, String roleName) {
        this.rolId = rolId;
        this.roleName = roleName;
    }

    @Id
    private Long rolId;
    private String roleName;

    public Role(){

    }

}
