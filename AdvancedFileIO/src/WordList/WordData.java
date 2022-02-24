package WordList;

public class WordData {
	@Override
	public String toString() {
		return "WordData [word=" + word + ", count=" + count + "]";
	}

	private String word;
	int count;
	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	public WordData(String word) {
		this.word = word;
		this.count = 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordData other = (WordData) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} 
		else if (!word.equals(other.word))
			return false;
		return true;
	}
}
