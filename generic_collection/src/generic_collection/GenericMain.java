package generic_collection;

/**
 * 코드가 동일한테 파라미터 타입만 다를 경우 제네릭 고려하면 좋다.
 */
public class GenericMain {
	public static void main(String[] args) {
//		ScoreList scoreList5 = new ScoreList(); //<- 제네릭은 사용할 때 명시해줘야 한다.
		ScoreList<Integer> score = new ScoreList<>(); // new 키워드 뒤에 <>는 명시하지 않아도 사용 가능하다.
//		ScoreList<String> scoreList3 = new ScoreList<String>();
//		ScoreList<Integer> scoreList4 = new ScoreList<Integer>();
		
		score.add(3);
		int score1 = score.get(0);
		System.out.println("사이즈는 " + score.size());
		score.add(4);
		System.out.println("사이즈는 " + score.size());
		score.add(6);
		System.out.println("사이즈는 " + score.size());
		score.add(7);
		System.out.println("사이즈는 " + score.size());
		score.add(8);
		
		
		
		int score2 = score.get(1);
		int score3 = score.get(2);
		int score4 = score.get(3);
		int score5 = score.get(4);
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		int size = score.size();
		System.out.println("사이즈는 " + size);
		
		System.out.println(score);
		System.out.println(score.toString());

	}
}
