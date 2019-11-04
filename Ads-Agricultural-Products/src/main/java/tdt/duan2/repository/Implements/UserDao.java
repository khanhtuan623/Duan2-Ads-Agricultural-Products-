package tdt.duan2.repository.Implements;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdt.duan2.entity.UserEntity;
import tdt.duan2.repository.UserRepository;

@Component
public class UserDao implements UserRepository {

	@Autowired
	private UserRepository userAction;
	@Override
	public <S extends UserEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return userAction.save(entity);
	}

	@Override
	public <S extends UserEntity> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UserEntity> findById(Long id) {
		Optional<UserEntity> user=userAction.findById(id);
		// TODO Auto-generated method stub
		return user;
	}
	

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return userAction.findAll();
	}

	@Override
	public Iterable<UserEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UserEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
