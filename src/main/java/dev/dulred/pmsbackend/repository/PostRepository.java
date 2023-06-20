package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Post;
import dev.dulred.pmsbackend.entity.PostByCon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PostRepository {
        int addPost (Post post);
        List<Post> getPostByPage (PostByCon postByCon);
        List<Post> getPostByCon (PostByCon postByCon);
        int deletePost (int id);
        Post getPostDetail (int id);
        int updatePost (Post post);
        List<Map<String, Object>> selectAssociatePost(int id);
}
