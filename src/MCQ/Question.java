package MCQ;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.*;
import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name="question")
public class Question {

@Column(name="qname")
private String qname;
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}

@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.TABLE)

private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@Column(name="answers")
@CollectionOfElements(targetElement=String.class)
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="qid")
private List<String> answers;
public List<String> getAnswers() {
	return answers;
}

public void setAnswers(List<String> answers) {
	this.answers = answers;
}


}
