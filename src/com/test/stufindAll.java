package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IStudentMapper;
import com.po.Student;

public class stufindAll {
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
			//Student st=new Student("张三","男","西安",new Date(),1);
			List<Student> lsst=studentMapper.findAll();
			for(Student st:lsst){
				System.out.println("编号:"+st.getStuid());
				System.out.println("姓名:"+st.getSname());
				System.out.println("性别:"+st.getSex());
				System.out.println("地址:"+st.getAddress());
				System.out.println("生日:"+st.getBirthday());
				System.out.println("班级编号:"+st.getClassid());
				System.out.println("班级名称:"+st.getCname());
				System.out.println("=======");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
