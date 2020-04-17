package MCQ;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Store {
 public static void main(String arg[]){

	 Session session=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t=session.beginTransaction(); 
     ArrayList<String> list1=new ArrayList<String>();
     list1.add("java is lit");
     list1.add("java is poor");
     
     ArrayList<String> list2=new ArrayList<String>();
     list2.add("servlet is an interface");
     list2.add("servlet is an API");
    		 
     Question question1=new Question();
     question1.setQname("what is java ?");
     question1.setAnswers(list1);
     
     Question question2=new Question();
     question2.setQname("what is Servlet ?");
     question2.setAnswers(list2);
     
     session.persist(question1);
     session.persist(question2);
     
     t.commit();
     session.close();
     System.out.println("success");
 }
 }
