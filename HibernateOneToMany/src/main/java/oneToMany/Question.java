package oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
@Id
	private int qid;
	private String ques;
	@OneToMany
	private List<Answers> ans;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<Answers> getAns() {
		return ans;
	}
	public void setAns(List<Answers> ans) {
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String ques, List<Answers> ans) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.ans = ans;
	}
	
}
