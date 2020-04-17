package MCQ;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session =new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Query query=session.createQuery("from Question");
		List<Question> list=query.list();
		Iterator<Question> itr =list.iterator();
		while(itr.hasNext()){
			Question q=itr.next();
			System.out.println("Question name: "+q.getQname());
		}
	}

}
