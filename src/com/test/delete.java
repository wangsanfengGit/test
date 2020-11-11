package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IStudentMapper;
import com.po.Student;

public class delete {
   public static void main(String[] args) {
	SqlSessionFactory sessionFactory=null;
	SqlSession session=null;
	try {
		//加载mybatis的配置资源文件
		InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
		//获取sessionFactory
		sessionFactory=new SqlSessionFactoryBuilder().build(in);
		//获取会话
		session=sessionFactory.openSession();
		System.out.println("session==>:"+session);
		//获取映射接口对象
		IStudentMapper studentMapper=session.getMapper(IStudentMapper.class);
		
		int rows=studentMapper.delById(4);
		if(rows>0){
			session.commit();
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
