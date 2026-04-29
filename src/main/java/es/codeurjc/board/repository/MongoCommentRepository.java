package es.codeurjc.board.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.codeurjc.board.model.CommentMongo;

public interface MongoCommentRepository extends MongoRepository<CommentMongo, Long> {
    
}
