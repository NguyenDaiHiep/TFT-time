package hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;



public class Test {
	public static void main(String[] args) {
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		Transaction tr = session.beginTransaction();
//		
		//User user1 = new User("cat", "cat@animals.net");	
		//delete
//		Comments cm = session.get(Comments.class, 8);
//		session.delete(cm);
		
		
		//session.save(user1);
//		Video video1 = new SDVideo("My Dogs");
//		user1.author(video1);
//		session.save(video1);
		//Comments comment3 = new Comments("good dog", video1, user1);
		//Comments comment4 = new Comments("crazy dog hahahaah", video1, user1);
		//session.save(comment3);
		//session.save(comment4);
//		session.save(video1);
//		user1.author(video1);
//		Comments comment1 = new Comments("I love my dogs, they are the best!",
//		video1, user1);
//		session.save(comment1);
//		User user1 = new User("chicken", "chicken@animals");
//		User user2 = new User("cat", "cat@animals.net");
//		session.save(user1);
//		session.save(user2);
//		Video video1 = new SDVideo("carton");
//		Video video2 = new HDVideo("mavel");
//		session.save(video1);
//		session.save(video2);
//		User user2 = new User("Kitty", "kitty@animals.net");
//		session.save(user2);
//		Video video2 = new HDVideo("Awesome Cat Action");
//		session.save(video2);
//		user2.author(video2);
//		Comments comment2 = new Comments("hahahahahahahaah", video2, user2);
//		session.save(comment2);

//
//		Comments comment1 = new Comments("perfect", video1, user1);
//		session.save(comment1);
		//tr.commit();
		//session.close();
		//sessFact.close();
		//showTitleAllVideo();
	showTileUserVideo();
		//showtileUserComment();
		//showTitleCommentedOnday();
		//showTitleMaxComment();
		//showUser();
		
	}
	public static void showTitleAllVideo(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String allTile = "SELECT v.title FROM video v";
		Query query = session.createSQLQuery(allTile);
		results = query.getResultList();
		System.out.println(results);
		
	}
	public static void showTileUserVideo(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String tileUserVideo = "SELECT v.title FROM video v WHERE idUser = 39";
		Query query = session.createSQLQuery(tileUserVideo);
		results = query.getResultList();
		System.out.println(results);
	}
	public static void showtileUserComment(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String titleuserComment ="SELECT v.title FROM video v INNER JOIN comments c ON v.idUser = c.idUser";
		Query query = session.createSQLQuery(titleuserComment);
		results = query.getResultList();
		System.out.println(results);
		
	}
	public static void showTitleCommentedOnday(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String titleuserComment ="SELECT v.title FROM video v INNER JOIN comments c ON v.id = c.idvideo WHERE TIME(17-5-2018)";
		Query query = session.createSQLQuery(titleuserComment);
		results = query.getResultList();
		System.out.println(results);
		
	}
	public static void showTitleMaxComment(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String titleuserComment ="SELECT v.title FROM video v INNER JOIN comments c ON v.id = c.idvideo GROUP BY comment HAVING COUNT(*)>=ALL(SELECT COUNT(*) FROM comments GROUP BY comment)";
		Query query = session.createSQLQuery(titleuserComment);
		results = query.getResultList();
		System.out.println(results);
		
		
	}
	public static void showUser(){
		List<String > results = new ArrayList<String>();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		String titleuserComment ="SELECT u.nickName FROM user u INNER JOIN video v ON u.id=v.idUser WHERE v.SD=2";
		Query query = session.createSQLQuery(titleuserComment);
		results = query.getResultList();
		System.out.println(results);
		
	}
	public static void delete(){
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		Transaction tr = session.beginTransaction();
		String hql = "DELETE FROM comments c WHERE c.id = 8";
	Query query = session.createQuery(hql);
	int result = query.executeUpdate();
		
		
	}
	
}
