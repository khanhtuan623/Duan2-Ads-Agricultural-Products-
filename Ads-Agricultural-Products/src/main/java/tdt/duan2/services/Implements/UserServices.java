package tdt.duan2.services.Implements;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import tdt.duan2.entity.UserEntity;
import tdt.duan2.model.Profile;
import tdt.duan2.services.UserSerives;

@Service
public class UserServices implements UserSerives {

	@Override
	public UserEntity getUserByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object updateProfile(Profile profile) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity Login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
