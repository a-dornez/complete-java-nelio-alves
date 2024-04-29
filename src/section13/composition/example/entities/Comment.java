/*
 * This is instructor's code
 */

package section13.composition.example.entities;

public class Comment {
	
	private String text;
	
	public Comment() {
	}

	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}

