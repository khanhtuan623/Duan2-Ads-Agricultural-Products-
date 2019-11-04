package tdt.duan2.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdt.duan2.entity.UserEntity;
import tdt.duan2.exception.NotFound;
import tdt.duan2.model.Profile;
import tdt.duan2.repository.Implements.UserDao;

@Service
public class UserServices implements UserSerivesInterface {

	@Autowired
	private UserDao userDao;
	@Override
	public UserEntity getUserByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object updateUser(Profile profile) throws ParseException,NotFound {
	    Date birthDate=new SimpleDateFormat("dd/MM/yyyy").parse(profile.getBirthDate());  
		Iterable<UserEntity>users= userDao.findAll();
		for(UserEntity userEntity:users) {
			if(userEntity.getUserName().equals(profile.getUserName())) {
				userEntity.setAddress(profile.getAddress());
				userEntity.setAvatar(profile.getAvatar());
				userEntity.setBirthDate(birthDate);
				userEntity.setCreateBy(profile.getUserName());
				userEntity.setEmail(profile.getEmail());
				userEntity.setName(profile.getName());
				userEntity.setPhone(profile.getPhone());
				userEntity.setSex(profile.getSex());
				userEntity.setStatus(1);
				userDao.save(userEntity);
				profile.setId(userEntity.getId());
				return userEntity;
			}
		}		
		return profile;
	}

	
	
}
