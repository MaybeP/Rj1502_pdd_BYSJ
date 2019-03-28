package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.BysjAuthorMapper;
import top.maybe123.pojo.BysjAuthor;

import java.util.List;

/*
** 作者信息查询
*  @author pdd
 */
@Service
public class AuthorServicce  {
@Autowired
BysjAuthorMapper bysjAuthorMapper;
public List<BysjAuthor> getAuthorByname(String name){


    BysjAuthor bysjAuthor=new BysjAuthor();
return bysjAuthorMapper.queryBysjAuthor(bysjAuthor);
}
}
