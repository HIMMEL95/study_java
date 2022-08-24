package com.spopia.study.ch06;

public class ArticleExample {

	public static void main(String[] args) {

		Article article = new Article();
		article.print();
		
		System.out.println("------------------------------------------");
		
		Article article2 = new Article("이하늘");
		article2.print();
		
		System.out.println("------------------------------------------");
		
		Article article3 = new Article("박지성", 10);
		article3.print();
		
		System.out.println("------------------------------------------");
		
		Article article4 = new Article("박태환", true);
		article4.print();
		
		System.out.println("------------------------------------------");
		
		Article article5 = new Article("이승엽", 20 ,true);
		article5.print();
		
		System.out.println(Article.nationality);
		System.out.println(Article.staticTest(20));
		
		Article article6 = new Article();
		int result = article6.staticTest2(10);
		System.out.println(result);
		
	}

}




