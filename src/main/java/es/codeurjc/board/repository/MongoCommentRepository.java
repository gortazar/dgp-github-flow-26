package es.codeurjc.board.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.codeurjc.board.model.Comment;

public interface MongoCommentRepository extends MongoRepository<Comment, Long> {
    
}
