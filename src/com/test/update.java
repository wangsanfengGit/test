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

public class update {
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
		Student st=new Student(3,"����","Ů","����",new Date(),2);
		int rows=studentMapper.update(st);
		if(rows>0){
			session.commit();
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
