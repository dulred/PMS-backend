package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Post;
import dev.dulred.pmsbackend.entity.PostByCon;
import dev.dulred.pmsbackend.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostServiceImpl implements PostService{

    @Resource
    PostRepository postRepository;
    @Override
    public String addPost(Post post) {
        if (postRepository.addPost(post)>0){
            return "ok";
        }else {
            return "no";
        }
    }

    @Override
    public Map<String,Object> getPostByPage(PostByCon postByCon) {
        Map<String ,Object> map  =new HashMap<>();
        postByCon.setAct("byPage");
        List<Post> posts = postRepository.getPostByPage(postByCon);
        map.put("posts",posts);
        int total = postRepository.getPostByPage(null).size();
        map.put("total",total);
        return map;
    }

    @Override
    public Map<String, Object> getPostByCon(PostByCon postByCon) {
        Map<String ,Object> map  =new HashMap<>();
        postByCon.setAct("byPage");
        List<Post> posts = postRepository.getPostByCon(postByCon);
        map.put("posts",posts);
        postByCon.setAct("byNoPage");
        int total = postRepository.getPostByCon(postByCon).size();
        map.put("total",total);
        return map;
    }

    @Override
    public String deletePost(int id) {
        if (postRepository.deletePost(id)>0){
            return "ok";
        }else {
            return "no";
        }

    }

    @Override
    public Post getPostDetail(int id) {
       return postRepository.getPostDetail(id);
    }

    public String updatePost (Post post)
    {
        if (postRepository.updatePost(post)>0){
            return  "ok";
        }else {
            return "no";
        }
    }

    @Override
    public List<Post> getPost() {
        return postRepository.getPostByPage(null);
    }
}
