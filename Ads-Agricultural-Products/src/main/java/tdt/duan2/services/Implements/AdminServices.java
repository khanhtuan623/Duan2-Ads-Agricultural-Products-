package tdt.duan2.services.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdt.duan2.entity.RoleEntity;
import tdt.duan2.repository.RoleRepository;

@Service
public class AdminServices implements tdt.duan2.services.AdminServices{
	
	@Autowired
	private RoleRepository roleAction;
	
	@Override
	public void addRole(RoleEntity role) {
		roleAction.save(role);
	}
}
