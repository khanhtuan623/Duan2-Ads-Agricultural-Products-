package tdt.duan2.services;

import java.text.ParseException;

import tdt.duan2.entity.UserEntity;
import tdt.duan2.model.Profile;

public interface UserSerives {
	
	UserEntity Login(String userName,String passWord);
	UserEntity getUserByID(Long id);
	Object updateProfile(Profile profile) throws ParseException;
}
