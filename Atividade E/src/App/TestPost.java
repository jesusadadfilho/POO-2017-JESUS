package App;
import Model.Post;
public class TestPost {
	public static void main(String[] args){
		Post p = new Post(1);
		p.AddLike(300);
		System.out.println(p.GetLikes());
	
	
	}

}
