package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Post;
import dev.dulred.pmsbackend.entity.PostByCon;

import java.util.List;
import java.util.Map;

public interface PostService {
    String addPost (Post post);
    Map<String, Object> getPostByPage (PostByCon postByCon);
    Map<String, Object> getPostByCon (PostByCon postByCon);
    String deletePost (int id);
    Post getPostDetail (int id);
    String updatePost (Post post);
    List<Post> getPost ();
}
