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
			//����mybatis��������Դ�ļ�
			InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
			//��ȡsessionFactory
			sessionFactory=new SqlSessionFactoryBuilder().build(in);
			//��ȡ�Ự
			session=sessionFactory.openSession();
			System.out.println("session==>:"+session);
			//��ȡӳ��ӿڶ���
			IStudentMapper studentMapper=session.getMapper(IStudentMapper.class);
			//Student st=new Student("����","��","����",new Date(),1);
			List<Student> lsst=studentMapper.findAll();
			for(Student st:lsst){
				System.out.println("���:"+st.getStuid());
				System.out.println("����:"+st.getSname());
				System.out.println("�Ա�:"+st.getSex());
				System.out.println("��ַ:"+st.getAddress());
				System.out.println("����:"+st.getBirthday());
				System.out.println("�༶���:"+st.getClassid());
				System.out.println("�༶����:"+st.getCname());
				System.out.println("=======");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
