package com.example.marketplace.Wishlist;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name="wishlists")
public class Wishlist {
    @GeneratedValue()
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "create_date")
    private Date createDate;
    @Basic
    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wishlist wishlist = (Wishlist) o;

        if (id != wishlist.id) return false;
        if (userId != null ? !userId.equals(wishlist.userId) : wishlist.userId != null) return false;
        if (createDate != null ? !createDate.equals(wishlist.createDate) : wishlist.createDate != null) return false;
        if (name != null ? !name.equals(wishlist.name) : wishlist.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
