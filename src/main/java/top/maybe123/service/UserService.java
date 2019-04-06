package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.base.BysjUserBaseMapper;
import top.maybe123.pojo.BysjUser;

@Service
public class UserService {
	@Autowired
	BysjUserBaseMapper bysjUserBaseMapper;
	//查询用户
	public BysjUser getUser(BysjUser bysjUser){
		return bysjUserBaseMapper.queryBysjUserLimit1(bysjUser);
	}
	//修改密码，以及其他
	public void uodateUser(BysjUser bysjUser){
		bysjUserBaseMapper.updateBysjUser(bysjUser);
	}
	//插入用户
	public void insertUser(BysjUser bysjUser){
		bysjUserBaseMapper.insertBysjUser(bysjUser);
	}
	//注销用户
	public void updateUser(BysjUser bysjUser){
		bysjUser.setU_name("bysj_delete");
	}
	
}
