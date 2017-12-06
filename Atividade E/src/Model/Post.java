package Model;

public class Post {
	private int countLikes;
	public Post(int initialLikes) {
		this.countLikes = initialLikes;
		}
	public void AddLike(int valor) {
		this.countLikes += valor;
	}
	public int GetLikes(){
		return this.countLikes;
	}
}
