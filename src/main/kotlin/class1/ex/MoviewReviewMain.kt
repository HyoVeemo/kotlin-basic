package class1.ex

class MovieReviewMain1 {
    fun run(){
        val movieReview1 =  MovieReview(title = "인셉션", review = "무한 루프")
        val movieReview2 =  MovieReview(title = "어바웃타입", review = "인생 영화~")

        println("영화제목: ${movieReview1.title} 리뷰내용: ${movieReview1.review}")
        println("영화제목: ${movieReview2.title} 리뷰내용: ${movieReview2.review}")
    }
}

class MovieReviewMain2 {
    fun run(){
        val movieReview1 =  MovieReview(title = "인셉션", review = "무한 루프")
        val movieReview2 =  MovieReview(title = "어바웃타입", review = "인생 영화~")
        val reviews = listOf<MovieReview>(movieReview1, movieReview2)

        for (review in reviews){
            println("영화제목: ${review.title} 리뷰내용: ${review.review}")
        }
    }
}

fun main(args: Array<String>) {
    MovieReviewMain1().run()
    MovieReviewMain2().run()
}