package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.base.BysjUserBaseMapper;
import top.maybe123.pojo.BysjUser;

/*
*@author pdd
* 处理用户相关服务
 */
@Service
public class UserService {
	@Autowired
	BysjUserBaseMapper bysjUserBaseMapper;
	//查询用户
	public BysjUser getUser(BysjUser bysjUser){
		return bysjUserBaseMapper.queryBysjUserLimit1(bysjUser);
	}
	//修改密码，以及其他
	public void updateUser(BysjUser bysjUser){

		System.out.println(bysjUser.toString());
		bysjUserBaseMapper.updateBysjUser(bysjUser);
	}
	//插入用户
	public void insertUser(BysjUser bysjUser){
		bysjUserBaseMapper.insertBysjUser(bysjUser);
	}
	//注销用户
	public void deleteUser(BysjUser bysjUser){
		bysjUser.setU_name("bysj_delete");
		bysjUserBaseMapper.updateBysjUser(bysjUser);
	}
	
}
