package tdt.duan2.services;

import java.text.ParseException;

import tdt.duan2.entity.UserEntity;
import tdt.duan2.model.Profile;

public interface UserSerivesInterface {
	public abstract UserEntity getUserByID(Long id);
	public abstract Object updateUser(Profile profile) throws ParseException;
}
