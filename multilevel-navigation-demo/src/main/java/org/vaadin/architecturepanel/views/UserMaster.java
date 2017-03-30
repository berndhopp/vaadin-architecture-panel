package org.vaadin.architecturepanel.views;

import com.vaadin.ui.Grid;

import org.vaadin.architecturepanel.db.Dao;
import org.vaadin.architecturepanel.db.User;

class UserMaster extends Grid<User> {

    UserMaster(){
        super(User.class);
        setItems(Dao.USER_DAO.getAll());
    }
}
