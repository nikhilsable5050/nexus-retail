package com.nexus.retail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;

    public Category(Long categoryID, String categoryName) {
        this.categoryId = categoryID;
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public Long getCategoryID() {
        return categoryId;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryId = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
