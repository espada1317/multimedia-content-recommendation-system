package com.example.recsys.service;

import com.example.recsys.dto.BookReviewDto;
import com.example.recsys.entity.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Books> getAllBooks();

    List<Books> searchBooksByMultipleFilter(String keyword, String genre, String author);

    List<String> getBooksGenres();

    Books getBookById(Integer bookId);

    void saveReview(Integer animeId, String nickname, BookReviewDto bookReviewDto);

    void updateReview(String nickname, Integer bookId, BookReviewDto bookReviewDto);

    void deleteReview(String nickname, Integer bookId);

    Optional<BookReview> getReviewByNicknameAndBookId(String nickname, Integer bookId);

    List<BookReview> getBookActivity(String nickname);

    List<BookReview> searchPersonalBooksByMultipleFilter(String nickname, String category, String sortBy);

    List<BookReview> getAllUserAndFriendsBooksActivity(String nickname);

    List<BookReview> getRecentCompletedBook(String nickname);

    List<BookReview> getPlanToReadBook(String nickname);

    List<BookReview> getReviewsByNickname(String nickname);

    List<BookReview> getAllActivityByNickname(String nickname);

    List<Books> getSimilarContent(Books books);

    List<Books> findByTitleContaining(String title, Integer bookKey);

    List<Books> recommendedByFriends(List<Books> followers, String nickname);

    List<Books> personalRecommended(String nickname, List<Books> followers);

    List<Books> parseFriendsBooks(List<Followers> followers);

}