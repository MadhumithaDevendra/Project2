package oneToMany;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	private int aid;
	private String answer;
	@ManyToOne
	private Question ques;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQues() {
		return ques;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answers(int aid, String answer, Question ques) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.ques = ques;
	}
	
}
