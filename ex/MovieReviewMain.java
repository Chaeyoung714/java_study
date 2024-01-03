package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "토이스토리";
        review1.review = "내 인생 최고의 갓작";

        MovieReview review2 = new MovieReview();
        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        MovieReview[] reviews = new MovieReview[]{review1, review2};

        for (MovieReview r : reviews) {
            System.out.println("영화 제목: \""  + r.title + "\", 리뷰: \"" + r.review + "\"");
        }
    }
}
